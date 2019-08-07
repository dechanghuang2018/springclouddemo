package com.qianfeng.springcloud.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.qianfeng.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id){
        return new User(id);
    }

    @GetMapping("/eurekainfo")
    public String info(){
        InstanceInfo instance = eurekaClient.getNextServerFromEureka("PROVIDER-USER", false);
        return instance.getHomePageUrl();
    }
}
