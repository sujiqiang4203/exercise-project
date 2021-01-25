package com.sjq.exercise.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/test")
    public String testEurekaClient() {

        return "this is eureka-clinet,server.port = " + serverPort;
    }

}
