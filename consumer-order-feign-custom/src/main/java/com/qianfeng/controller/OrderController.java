package com.qianfeng.controller;

import com.qianfeng.feign.MyFeignClinet;
import com.qianfeng.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: hdc
 * @Date: 2019/8/5 16:30
 */
@RestController
public class OrderController {

    @Autowired
    private MyFeignClinet myFeignClinet;

    @GetMapping("/order/{id}")
    public User getOrder(@PathVariable("id") Long id){
        User user = myFeignClinet.getOrder(id);
        return user;
    }
}
