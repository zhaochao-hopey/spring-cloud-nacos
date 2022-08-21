package com.eureka.client001.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc: LogController
 * @author: anton
 * @date: 2022/8/21
 * slogan: When I first wrote this code, God and I knew the meaning of this code, now only God knows
 */
@Slf4j
@RestController
@RequestMapping("/api/eureka/client/log")
public class EurekaLogController {

    @GetMapping("/output")
    public String output() {
        String content = "eureka-client001: output";
        log.info(content);
        return content;
    }
}
