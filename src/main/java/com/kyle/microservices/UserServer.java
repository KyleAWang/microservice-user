package com.kyle.microservices;

import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Kyle on 7/10/2017.
 */
@EnableAutoConfiguration
@EnableDiscoveryClient
public class UserServer {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "user-server");

        SpringApplication.run(UserServer.class, args);
    }
}
