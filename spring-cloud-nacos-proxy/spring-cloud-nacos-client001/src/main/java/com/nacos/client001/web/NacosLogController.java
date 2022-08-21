package com.nacos.client001.web;

import com.nacos.client001.client.LogApiClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @desc: LogController
 * @author: anton
 * @date: 2022/8/21
 * slogan: When I first wrote this code, God and I knew the meaning of this code, now only God knows
 */
@Slf4j
@RestController
@RequestMapping("/api/nacos/client/log")
public class NacosLogController {

    @Resource
    private LogApiClient logApiClient;

    @GetMapping("/output")
    public String output() {
        String content = "nacos-client001: output";
        log.info(content);
        return logApiClient.output();
    }
}
