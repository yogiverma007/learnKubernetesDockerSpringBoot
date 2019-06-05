package com.freedom.learnKDSB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/v1")

public class HealthController {

    @GetMapping("/ping")
    public HealthResponse ping() {
        long duration = 5L;
        HealthResponse healthResponse = new HealthResponse();
        healthResponse.setProgram("learnKDSB");
        healthResponse.setVersion("1.0");
        healthResponse.setDatetime(new Date().toString());
        healthResponse.getData().setDuration((float) duration);
        healthResponse.getData().setMessage("Service is healthy");

        return healthResponse;
    }

    @GetMapping("/health")
    public HealthResponse health() {
        return ping();
    }

}