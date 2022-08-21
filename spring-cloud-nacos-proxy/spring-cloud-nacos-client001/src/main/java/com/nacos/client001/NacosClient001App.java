package com.nacos.client001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients("com.nacos.client001.client")
@SpringBootApplication
public class NacosClient001App {

    public static void main(String[] args) {
        SpringApplication.run(NacosClient001App.class, args);
    }

}
