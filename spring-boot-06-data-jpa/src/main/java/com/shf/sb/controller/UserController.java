package com.shf.sb.controller;

import com.shf.sb.entity.User;
import com.shf.sb.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserRespository userRespository;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        User u = new User();
        Optional<User> user = userRespository.findById(id);
        return user.isPresent() ? user.get() : null;
    }

    @GetMapping("/user")
    public User insertUser(User user){
        User save = userRespository.save(user);
        return save;
    }
}
