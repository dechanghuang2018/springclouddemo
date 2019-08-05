package com.qianfeng.springcloud.controller;

import com.qianfeng.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author: hdc
 * @Date: 2019/8/5 16:30
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${user.url}")
    private String url;

    @GetMapping("/order/{id}")
    public User getOrder(@PathVariable Long id){
        // 访问提供者获取数据
        User user = restTemplate.getForObject(url + id, User.class);
        return user;
    }
}
