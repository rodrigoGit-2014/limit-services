package com.microservices.limitservices2.controller;

import com.microservices.limitservices2.configuration.ConfigProperties;
import com.microservices.limitservices2.model.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    private ConfigProperties configProperties;

    @GetMapping("/limit")
    public Limit retrieveLimit() {
        return new Limit(configProperties.getMinimum(), configProperties.getMaximum());
    }
}
