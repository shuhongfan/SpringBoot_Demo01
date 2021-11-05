package com.shf.springboot.controller;

import com.shf.springboot.excetion.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@ControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler({UserNotExistException.class})
    public String handleException(Exception e, HttpServletRequest request){
        HashMap<String, Object> hashMap = new HashMap<>();
        request.setAttribute("javax.servlet.error.status_code",400);
        hashMap.put("code","user not exist");
        hashMap.put("message","用户出错啦");
        request.setAttribute("ext",hashMap);
        return "forward:/error";
    }
}
