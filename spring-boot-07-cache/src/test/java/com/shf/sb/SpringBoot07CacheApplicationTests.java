package com.shf.sb;

import com.shf.sb.bean.Employee;
import com.shf.sb.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class SpringBoot07CacheApplicationTests {

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate redisTemplate;


    @Test
    public void test02(){
        Employee eMpById = employeeMapper.getEMpById(1);
        redisTemplate.opsForValue().set("emp-01",eMpById);
    }

    @Test
    public void test01(){
//        stringRedisTemplate.opsForValue() 字符串
//        stringRedisTemplate.opsForList() 列表
//        stringRedisTemplate.opsForSet()  集合
//        stringRedisTemplate.opsForHash() 散列
//        stringRedisTemplate.opsForSet()  有序集合

        stringRedisTemplate.opsForValue().append("msg","hello");
        String msg = stringRedisTemplate.opsForValue().get("msg");
        System.out.println(msg);

    }

    @Test
    void contextLoads() {
        Employee eMpById = employeeMapper.getEMpById(1);
        System.out.println(eMpById);
    }

}
