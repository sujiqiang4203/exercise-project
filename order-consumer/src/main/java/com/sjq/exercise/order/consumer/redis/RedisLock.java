package com.sjq.exercise.order.consumer.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @name RedisLock
 * @Description:
 * @author: sujiqiang
 * @Date: 2021/3/5 20:02
 */
@Slf4j
public class RedisLock {


    public static boolean lock(RedisTemplate redisTemplate, String key, String id, Long expire) {

        DefaultRedisScript<String> script = new DefaultRedisScript();
        script.setScriptText("" +
                "if (redis.call('exists', KEYS[1]) == 0) " +
                "then redis.call('hset', KEYS[1],ARGV[1], 1); " +
                "redis.call('pexpire', KEYS[1], ARGV[2]); " +
                "return nil; " +
                "end; " +
                "if (redis.call('hexists', KEYS[1], ARGV[1]) == 1) " +
                "then redis.call('hincrby', KEYS[1], ARGV[1], 1); " +
                "redis.call('pexpire', KEYS[1], ARGV[2]); " +
                "return nil; " +
                "end; " +
                "return redis.call('pttl', KEYS[1]);");
//        script.setScriptText("" +
//                "if redis.call('get', KEYS[1]) == ARGV[1] " +
//                "then return redis.call('del', KEYS[1]) " +
//                "else return 0 " +
//                "end;");
        script.setResultType(String.class);
        List<String> keys = Collections.singletonList(key);

        String result = (String) redisTemplate.execute(script, keys, id, expire);
        return result == null;
    }

    public static void unlock(RedisTemplate redisTemplate, String key, String id) {
        DefaultRedisScript<Long> script = new DefaultRedisScript();
        script.setScriptText("" +
                "if (redis.call('exists', KEYS[1]) == 0) " +
                "then return 0; " +
                "end; " +
                "if (redis.call('hexists', KEYS[1], ARGV[1]) == 0) " +
                "then return 0; " +
                "end; " +
                "local counter = redis.call('hincrby', KEYS[1], ARGV[1], -1); " +
                "if (counter > 0) " +
                "then return 1; " +
                "else " +
                "redis.call('del', KEYS[1]); " +
                "return 1; " +
                "end;");
        script.setResultType(Long.class);
        List<String> keys = Arrays.asList(key);
        redisTemplate.execute(script, keys, id);
    }

    public static boolean isLocked(RedisTemplate redisTemplate, String key, String id) {
        DefaultRedisScript<Long> script = new DefaultRedisScript<>();
        script.setScriptText("" +
                "if (redis.call('hexists', KEYS[1], ARGV[1]) == 0) " +
                "then return 0; " +
                "end; " +
                "return 1;");
        script.setResultType(Long.class);
        List<String> keys = Arrays.asList(key);
        Long result = (Long) redisTemplate.execute(script, keys, id);
        return result == 1L;
    }

}
