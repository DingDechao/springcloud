package com.ddc.springcloud.springcloudclient2.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfigServer {

    @Value("${example.property}")
    private String exampleProperties;

    public String getExampleProperties() {
        return exampleProperties;
    }

    public void setExampleProperties(String exampleProperties) {
        this.exampleProperties = exampleProperties;
    }


}
