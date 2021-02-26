package com.sjq.exercise.user.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @name UserController
 * @Description:
 * @author: sujiqiang
 * @Date: 2021/2/24 10:16
 */
@RequestMapping(value = "/user")
@RestController
public class UserServiceController {

    @Value("${server.port}")
    private int port;
    @Value("${spring.application.name}")
    private String serverName;

    @GetMapping(value = "/serverInfo")
    public String getServerInfo() {
        return "serverPort = " + port + ",and serverName = " + serverName;
    }


}
