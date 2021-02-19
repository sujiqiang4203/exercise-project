package com.sjq.exercise.ribbon.server.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author IT00003849
 */
@EnableEurekaServer
@SpringBootApplication
public class RibbonServerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonServerUserApplication.class, args);
        System.out.println("springCloud ribbon server user start --------------");
    }

}
