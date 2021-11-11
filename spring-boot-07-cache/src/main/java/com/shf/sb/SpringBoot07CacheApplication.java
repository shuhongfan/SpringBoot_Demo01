package com.shf.sb;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan("com.shf.sb.mapper")
@SpringBootApplication
@EnableCaching  // 开启缓存
public class SpringBoot07CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot07CacheApplication.class, args);
    }

}
