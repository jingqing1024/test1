package com.lingyue.java.mycontroller;

import com.lingyue.java.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lingyue
 * @create 2021-05-16-13:56
 */
@RestController
public class RedisController {
    @Autowired
    RedisService redisService;

    @RequestMapping("/redisTest")
    public String insertRedis(String key, String value) {
        redisService.insertRedis(key, value);
        return "成功插入一条数据！";
    }

    @RequestMapping("/findRedis")
    public String findRedis(String key) {
        String redis = redisService.findRedis(key);
        return redis;
    }
}
