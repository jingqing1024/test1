package com.lingyue.java;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.Set;

@SpringBootTest
class ApplicationTests {
    public static void main(String[] args) {
        //System.out.println("1111");
       /* Jedis jedis = new Jedis("127.0.0.1",6379);
        System.out.println(jedis.ping());*/
        /*jedis.set("k1", "v1");
        jedis.set("k2", "v2");*/
        /*Set<String> keys = jedis.keys("*");
        for (Object o : keys) {
            System.out.println(o);
        }*/
        /*Boolean k1 = jedis.exists("k1");
        System.out.println(k1);
        jedis.select(1);*/

    }

    @Test
    void contextLoads() {
    }

}
