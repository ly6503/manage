package com.qiouou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Classname LiuYin
 * @Date 2020/8/3 19:35
 * @Description
 */
@SpringBootApplication(scanBasePackages = {
        "com.qiouou.controller",
        "com.qiouou.feign",
        "com.qiouou.conf"
})
@EnableDiscoveryClient
@EnableFeignClients  //(basePackages = "com.qiouou.feign")
public class ToursApp {
    public static void main(String[] args) {
        SpringApplication.run(ToursApp.class, args);
    }
}
