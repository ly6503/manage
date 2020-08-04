package com.qiouou.feign;

import com.qiouou.conf.FeignConfiguration;
import com.qiouou.fallback.ToursFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Classname LiuYin
 * @Date 2020/8/3 21:01
 * @Description
 */
@FeignClient(name = "centre-server", fallback = ToursFallback.class, configuration = FeignConfiguration.class)
public interface ToursFeign {

    @GetMapping("/centre")
    String hello();
}
