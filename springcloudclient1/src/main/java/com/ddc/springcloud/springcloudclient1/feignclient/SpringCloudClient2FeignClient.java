package com.ddc.springcloud.springcloudclient1.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("springcloudclient2")
public interface SpringCloudClient2FeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/helloworld")
    String getString();

}
