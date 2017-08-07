package com.kyle.microservices;

import com.kyle.microservices.controllers.UserController;
import com.kyle.microservices.service.UserService;
import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

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

    @Bean
    public UserService userLoginService() {
        return new UserService();
    }

    @Bean
    public UserController userController() {
        return new UserController();
    }
}
