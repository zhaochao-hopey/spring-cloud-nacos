package com.nacos.client001.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "eureka-client001", contextId = "logApiClient", path = "api/eureka/client/log")
public interface LogApiClient {

    @GetMapping("/output")
    String output();
}
