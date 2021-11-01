package com.sjq.test.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author user
 */
@Component
public class TodoTaskService {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    private final String taskKey = "2021002";

    @Scheduled(fixedRate = 1000000000)
    public void doTask() {

        System.out.println("定时任务开始执行");

        for (int i = 1; i <= 100; i++) {

            redisTemplate.opsForHash().put("TD", taskKey, (double) i / 100);

            if (i % 5 == 0) {
                System.out.println("保存到数据库：" + i + ",当前进度：" + redisTemplate.opsForHash().get("TD", taskKey));
            }
        }
    }


}
