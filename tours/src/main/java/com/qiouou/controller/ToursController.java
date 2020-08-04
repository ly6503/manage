package com.qiouou.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.qiouou.feign.ToursFeign;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ToursController {

    @Autowired
    private ToursFeign feign;

    @GetMapping("/tours")
    @SentinelResource(value = "hello", blockHandler = "blockHandler", defaultFallback = "defaultFallback")
    public String hello(){
        int i = 1/0;
        System.out.println("tours");
        return feign.hello();
    }

    public String blockHandler(BlockException e){
        return "被限流了！o(╥﹏╥)o";
    }

    public String defaultFallback(){
        return "系统出错了！";
    }
}
