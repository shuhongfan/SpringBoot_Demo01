package com.shf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody  // 将所有返回的数据直接写给浏览器（如果是对象转为json数据）
//@Controller   // RestController=ResponseBody+Controller
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world quick!!!";
    }
}
