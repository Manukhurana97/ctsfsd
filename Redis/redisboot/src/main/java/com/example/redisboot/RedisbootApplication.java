package com.example.redisboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class RedisbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisbootApplication.class, args);
    }

}
