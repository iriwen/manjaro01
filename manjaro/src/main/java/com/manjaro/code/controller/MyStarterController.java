package com.manjaro.code.controller;

//import com.boot.autoconfig.MyStarterService;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * created by iriwen on 2020/06/24.
 */
@RestController
@RequestMapping(value = "/starter")
public class MyStarterController {

    @Resource
    private ObjectMapper objectMapper;

    /*@Autowired
    private MyStarterService starterService;

    @RequestMapping(value = "/starterInfo")
    public Object getStarterInfo() {
        return starterService.sayHello();
    }*/
}

