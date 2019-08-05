package com.qianfeng.springcloud.controller;

import com.qianfeng.springcloud.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: hdc
 * @Date: 2019/8/5 16:15
 */
@RestController
public class UserController {
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id){
        return new User(id);
    }
}
