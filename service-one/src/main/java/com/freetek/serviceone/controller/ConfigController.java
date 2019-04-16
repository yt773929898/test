package com.freetek.serviceone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author YT
 * @date 2019-04-16
 */
@RestController
public class ConfigController {
    @Value("${bbbb}")
    private String name;

    @GetMapping("/env")
    public String getEnv() {
        return name;
    }
}