package com.sjq.test.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author user
 */
@EnableScheduling
@SpringBootApplication
public class RedisExerciseApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisExerciseApplication.class, args);
    }

}
