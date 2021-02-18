package com.sjq.exercise.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
        System.out.println("springCloud eureka-client start -------------");
    }


    @Bean
    public RestTemplate restTemplate() {
        System.out.println("init restTemplate ---- ");
        return new RestTemplate();
    }

}
