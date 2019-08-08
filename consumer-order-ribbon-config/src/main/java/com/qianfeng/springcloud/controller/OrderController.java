package com.qianfeng.springcloud.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.qianfeng.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
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
    private EurekaClient eurekaClient;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${user.url}")
    private String url;

    @GetMapping("/order/{id}")
    public User getOrder(@PathVariable Long id){
        // 访问提供者获取数据
        InstanceInfo instance = eurekaClient.getNextServerFromEureka("PROVIDER-USER", false);
        String homePageUrl =  instance.getHomePageUrl();
        User user = restTemplate.getForObject(homePageUrl + "/user/" + id, User.class);
        return user;
    }

    @GetMapping("/test")
    public void test(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("PROVIDER-USER");
        System.out.println("111" + serviceInstance.getServiceId() + "," +serviceInstance.getHost() + ":" + serviceInstance.getPort());

        ServiceInstance serviceInstance1 = loadBalancerClient.choose("PROVIDER-USER1");
        System.out.println("222" + serviceInstance1.getServiceId() + "," +serviceInstance1.getHost() + ":" + serviceInstance1.getPort());
    }
}
