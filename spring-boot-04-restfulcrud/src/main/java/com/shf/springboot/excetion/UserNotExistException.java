package com.shf.springboot.excetion;

public class UserNotExistException extends RuntimeException{
    public UserNotExistException() {
        super("用户不存在");
    }
}
