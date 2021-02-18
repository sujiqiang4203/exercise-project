package com.sjq.exercise.ribbon.server.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RibbonServerCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonServerCenterApplication.class, args);
        System.out.println("springCloud ribbon server center start --------------");
    }

}
