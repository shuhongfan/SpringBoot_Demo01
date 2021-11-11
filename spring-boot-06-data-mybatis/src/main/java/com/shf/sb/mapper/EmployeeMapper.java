package com.shf.sb.mapper;

import com.shf.sb.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

//@Mapper或者@MapperScan(value = "com.shf.sb.mapper")将接口扫描装配到容器中
@Mapper
public interface EmployeeMapper {
    public Employee getEmpById(Integer id);

    public void insertEmployee(Employee employee);
}
