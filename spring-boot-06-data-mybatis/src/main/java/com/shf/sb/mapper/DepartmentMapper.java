package com.shf.sb.mapper;

import com.shf.sb.bean.Department;
import org.apache.ibatis.annotations.*;

//指定这是一个操作数据库的mapper
//@Mapper  @MapperScan(value = "com.shf.sb.mapper")批量扫描
@Mapper
public interface DepartmentMapper {
    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer deptId);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values (#{departmentName})")
    public int insertDept(Department dept);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department dept);
}
