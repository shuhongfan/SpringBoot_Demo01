package com.shf.config;

import com.shf.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // 指明当前类是一个配置类，用来代替之前的spring配置文件
public class MyAppConfig {
    @Bean   // 将方法的返回值添加到容器中；容器中这个组件默认的id就是方法名
    public HelloService helloService(){
        System.out.println("配置类@Bean给容器中添加组件了");
        return new HelloService();
    }
}
