package com.ddc.springcloud.springcloudclient2.controller;

import com.ddc.springcloud.springcloudclient2.config.SpringCloudConfigServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    SpringCloudConfigServer springCloudConfigServer;

    @GetMapping("/helloworld")
    public String helloRest() {
        return springCloudConfigServer.getExampleProperties();
    }

}
