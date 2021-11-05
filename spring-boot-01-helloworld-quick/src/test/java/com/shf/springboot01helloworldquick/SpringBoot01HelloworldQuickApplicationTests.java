package com.shf.springboot01helloworldquick;

import com.shf.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot01HelloworldQuickApplicationTests {
    @Autowired
    Person person;

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
