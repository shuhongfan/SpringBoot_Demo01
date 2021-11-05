package com.shf.springboot.controller;

import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;

import java.util.Map;

@Component
public class MyErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(RequestAttributes requestAttributes, boolean includeStackTrace) {
        Map<String, Object> errorAttributes = super.getErrorAttributes(requestAttributes, includeStackTrace);
        errorAttributes.put("company","shf");
//        我们的异常处理器携带的数据
        Map<String, Object> ext = (Map<String, Object>) requestAttributes.getAttribute("ext", 0);
        errorAttributes.put("ext",ext);
        return errorAttributes;
    }
}
