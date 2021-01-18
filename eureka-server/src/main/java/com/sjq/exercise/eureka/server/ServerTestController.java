package com.sjq.exercise.eureka.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @name ServerTestController
 * @Description:
 * @author: sujiqiang
 * @Date: 2021/1/18 19:35
 */
@RestController(value = "/server")
public class ServerTestController {

    @GetMapping(value = "/hello")
    public String sayHello() {
        return "hello client. I am eureka-server";
    }

}
