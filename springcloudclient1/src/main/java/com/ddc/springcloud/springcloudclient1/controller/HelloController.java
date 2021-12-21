package com.ddc.springcloud.springcloudclient1.controller;

import com.ddc.springcloud.springcloudclient1.config.SpringCloudConfigServer;
import com.ddc.springcloud.springcloudclient1.feignclient.SpringCloudClient2FeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {

    @Autowired
    SpringCloudConfigServer springCloudConfigServer;
    
    @Autowired
    SpringCloudClient2FeignClient springCloudClient2FeignClient;

    @GetMapping("/helloworld")
    public String helloRest() {
        return springCloudConfigServer.getExampleProperties();
    }
    
    @GetMapping("/testFeignClient")
    public  String testFeignClient() {
        return springCloudClient2FeignClient.getString();
    }

}
