package com.sjq.exercise.eureka.server.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author IT00003849
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerCenterApplication.class, args);
        System.out.println("springCloud eureka server center start --------------");
    }

}
