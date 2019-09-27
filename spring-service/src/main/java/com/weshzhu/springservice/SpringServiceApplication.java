package com.weshzhu.springservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * entry class
 * @author by Zhu Shidong
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringServiceApplication.class, args);
    }
}
