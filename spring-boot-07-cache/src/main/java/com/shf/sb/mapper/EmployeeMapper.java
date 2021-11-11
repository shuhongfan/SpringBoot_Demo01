package com.shf.sb.mapper;

import com.shf.sb.bean.Employee;
import org.apache.ibatis.annotations.*;

@Mapper
public interface EmployeeMapper {
    @Select("select * from employee where id = #{id}")
    public Employee getEMpById(Integer id);

    @Update("update employee set lastName=#{lastName},email=#{email},gender=#{gender},d_id=${dId} where id=#{id}")
    public void updateEmployee(Employee employee);

    @Delete("delete from employee where id=#{id}")
    public void deleteEmpById(Integer id);

    @Insert("insert into employee (lastName,email,gender,d_id) value(#{lastName},#{email},#{gender},#{dId})")
    public void insertEmployee(Employee employee);
}
