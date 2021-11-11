package com.shf.sb.repository;

import com.shf.sb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//继承JpaRepository来完成数据库的操作
public interface UserRespository extends JpaRepository<User,Integer> {

}
