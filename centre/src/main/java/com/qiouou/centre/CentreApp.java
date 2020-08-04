package com.qiouou.centre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname LiuYin
 * @Date 2020/8/3 19:35
 * @Description
 */
@SpringBootApplication(scanBasePackages = {
    "com.qiouou.controller"
})
@EnableDiscoveryClient
public class CentreApp {
    public static void main(String[] args) {
        SpringApplication.run(CentreApp.class, args);
    }
}
