package com.lingyue.java.service;

/**
 * @author lingyue
 * @create 2021-05-16-14:07
 */
public interface RedisService {
    void insertRedis(String key, String value);

    String findRedis(String key);
}
