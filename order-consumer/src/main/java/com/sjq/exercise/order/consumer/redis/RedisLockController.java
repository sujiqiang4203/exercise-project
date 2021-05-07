package com.sjq.exercise.order.consumer.redis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @name RedisLockController
 * @Description:
 * @author: sujiqiang
 * @Date: 2021/3/5 20:23
 */
@RestController
@RequestMapping("/redis")
public class RedisLockController {

    @Resource
    private RedisTemplate redisTemplate;

    @GetMapping("/test")
    public void testRedisLock() {

        final int[] num = {100};
        String key = "numCount";
        String id = "1111";

        new Thread(() -> {
            RedisLock.lock(redisTemplate, key, id, 2000L);
            num[0]--;
            System.out.println("this is thread1-------" + num[0]);
            //RedisLock.unlock(redisTemplate, key, id);
        }, "thread1").start();


        new Thread(() -> {
            System.out.println("this is thread2-------" + num[0]);
        }, "thread2").start();


    }


}
