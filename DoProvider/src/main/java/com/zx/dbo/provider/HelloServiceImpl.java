package com.zx.dbo.provider;


import com.zx.dbo.api.HelloService;

@org.apache.dubbo.config.annotation.Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello " + name;
    }
}
