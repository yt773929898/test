package com.freetek.serviceone.controller;

import com.freetek.serviceone.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author YT
 * @date 2019-04-16
 */
@RestController
public class FirstController {
    @Autowired
    FirstService firstService;


    /**
     * 测试
     * @return
     */
    @RequestMapping("/hello")
    public String method() {
        return firstService.mehtod();
    }
}
