package com.lingyue.java.service.Impl;

import com.lingyue.java.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author lingyue
 * @create 2021-05-16-14:09
 */
@Service
public class RedisServiceImpl implements RedisService {
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Override
    public String findRedis(String key) {
        String o = (String) redisTemplate.opsForValue().get(key);
        return o;
    }

    @Override
    public void insertRedis(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }
}
