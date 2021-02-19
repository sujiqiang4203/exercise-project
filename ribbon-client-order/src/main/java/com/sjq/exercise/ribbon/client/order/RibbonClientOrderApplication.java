package com.sjq.exercise.ribbon.client.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author IT00003849
 */
@EnableEurekaServer
@SpringBootApplication
public class RibbonClientOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonClientOrderApplication.class, args);
        System.out.println("springCloud ribbon client order start --------------");
    }

}
