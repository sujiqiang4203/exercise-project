package com.sjq.test.redis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {


    //    @Cacheable(value = "task", key = "#tid")
    @GetMapping("/getById/{tid}")
    public void getTaskStatus(@PathVariable Integer tid) {

    }


}
