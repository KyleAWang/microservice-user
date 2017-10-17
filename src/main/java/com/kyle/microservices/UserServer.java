package com.kyle.microservices;

import com.kyle.microservices.controllers.UserController;
import com.kyle.microservices.dao.UserDao;
import com.kyle.microservices.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.logging.Logger;

/**
 * Created by Kyle on 7/10/2017.
 */
@EnableAutoConfiguration
@EnableDiscoveryClient
@SpringBootApplication
public class UserServer {
    private Logger logger = Logger.getLogger(UserServer.class.getName());

    public static void main(String[] args) {
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

    @Bean
    public MongoClientFactoryBean mongo() {
        MongoClientFactoryBean mongo = new MongoClientFactoryBean();
        return mongo;
    }

    @Bean
    public UserDao UserDao() {
        return new UserDao();
    }
}
