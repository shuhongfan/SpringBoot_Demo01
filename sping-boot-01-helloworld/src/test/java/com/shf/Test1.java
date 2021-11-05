package com.shf;

import com.shf.bean.Person;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test1 {
    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

    @Test
    public void helloService(){
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);
    }
}
