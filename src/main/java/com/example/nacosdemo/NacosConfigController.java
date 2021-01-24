package com.example.nacosdemo;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@NacosPropertySource(dataId="example",autoRefreshed = false)
@RestController
public class NacosConfigController {

    @NacosValue(value="${info:Local Hello World}",autoRefreshed = false)
    private String info;

    @GetMapping("/config")
    public String get(){
        return info;
    }
}
