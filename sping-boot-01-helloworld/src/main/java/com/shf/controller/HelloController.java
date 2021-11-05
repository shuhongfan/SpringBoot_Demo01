package com.shf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//    获取文件的值@Value
    @Value("${person.lastName}")
    private String name;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello "+name;
    }
}
