package com.sjq.exercise.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Random;

/**
 * @name TestController
 * @Description:
 * @author: sujiqiang
 * @Date: 2021/1/18 18:16
 */
@RequestMapping(value = "/client")
@RestController
public class ClientTestController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String testEurekaClient() {
        return "this is eureka-client,server.port = " + serverPort;
    }

    @GetMapping("/getServerById")
    public String getServerById() {
        return restTemplate.getForObject("http://localhost:8761/server/getById/" + (int)(Math.random() * 100), String.class);
    }

}
