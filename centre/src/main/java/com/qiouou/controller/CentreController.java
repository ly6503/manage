package com.qiouou.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname LiuYin
 * @Date 2020/8/3 19:42
 * @Description
 */
@RestController
public class CentreController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/centre")
    public String hello(){
        System.out.println("centre");
        return "Hello prot = " + port;
    }
}
