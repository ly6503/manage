package com.qiouou.fallback;

import com.qiouou.feign.ToursFeign;
import org.springframework.stereotype.Component;

/**
 * @Classname LiuYin
 * @Date 2020/8/3 21:08
 * @Description
 */
@Component
public class ToursFallback implements ToursFeign {

    @Override
    public String hello() {
        System.out.println("失败");
        return "tours";
    }
}
