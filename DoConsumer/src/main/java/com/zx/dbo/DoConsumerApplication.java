package com.zx.dbo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DoConsumerApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(DoConsumerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DoConsumerApplication.class);

    }

}
