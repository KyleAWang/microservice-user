package com.kyle.microservices.controllers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kyle.microservices.beans.UserLogin;
import com.kyle.microservices.service.UserService;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Kyle on 8/7/2017.
 */
@Controller
public class UserController {
    private Logger logger = Logger.getLogger(UserController.class.getName());

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user-login", method = RequestMethod.GET)
    public ResponseEntity userLogin(@RequestParam("username") String userName, @RequestParam("password") String password) {
        String jsonString = "";
        try {
            UserLogin userLogin = userService.userLogin(userName, password);

            ObjectMapper mapper = new ObjectMapper();
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            jsonString = mapper.writeValueAsString(userLogin);

        } catch (Exception e) {
            logger.error("login error", e);
            return new ResponseEntity("error", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<String>(jsonString, HttpStatus.OK);
    }
}
