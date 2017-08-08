package com.kyle.microservices.beans;

import lombok.Data;

/**
 * Created by Kyle on 8/8/2017.
 */
public @Data class UserLoginRequest {
    private String username;
    private String password;
}
