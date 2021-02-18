package com.sjq.exercise.eureka.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @name ServerTestController
 * @Description:
 * @author: sujiqiang
 * @Date: 2021/1/18 19:35
 */
@RestController
@RequestMapping(value = "/server")
public class ServerTestController {

    @GetMapping(value = "/hello")
    public String sayHello() {
        return "hello client. I am eureka-server";
    }

    @GetMapping(value = "/getById/{id}")
    public String getById(@PathVariable("id") int id) {
        return "server id = " + id;
    }

}
