package com.shf.sb.service;

import com.shf.sb.bean.Employee;
import com.shf.sb.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "emp")
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

//    将方法的运行结果进行缓存；以后再要相同的数据，直接从缓存中获取，不调用方法
//    CacheManager管理多个Cache组件，对缓存真正的CURD操作在Cache组件中，每一个缓存组件有自己唯一一个名字
//    cacheNames缓存组件的名字
//    key 缓存使用的key
//    condition = "#a0>1"  第一个参数的值大于1执行
    @Cacheable(cacheNames = "emp")
    public Employee getEmp(Integer id){
        System.out.println("查询 "+id+" 号员工");
        Employee emp = employeeMapper.getEMpById(id);
        return emp;
    }

//    CachePut 即调用返回，有更新缓存数据
    @CachePut(value = "emp",key = "#result.id")
    public Employee updateEmp(Employee employee){
        employeeMapper.updateEmployee(employee);
        return employee;
    }

//    CacheEvict缓存清除
    @CacheEvict(value = "emp",key = "#id")
    public void deleteEmp(Integer id){
        System.out.println("deleteEmp:"+id);
//        employeeMapper.deleteEmpById(id);
    }
}
