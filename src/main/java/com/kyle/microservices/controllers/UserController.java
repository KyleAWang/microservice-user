package com.kyle.microservices.controllers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kyle.microservices.beans.UserLogin;
import com.kyle.microservices.beans.UserLoginRequest;
import com.kyle.microservices.dao.UserDao;
import com.kyle.microservices.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Kyle on 8/7/2017.
 */
@Controller
public class UserController {
    private Logger logger = Logger.getLogger(UserController.class.getName());

    @Autowired
    private UserService userService;
    @Autowired
    private UserDao userDao;

    @ApiOperation(value = "User login api", response = UserLogin.class)
    @RequestMapping(value = "/userLogin", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> userLogin(@RequestBody UserLoginRequest userLoginRequest) {
        final String methodName = "userLogin";
        logger.info(methodName + " starts...");
        String jsonString = "";
        try {
            UserLogin userLogin = userService.userLogin(userLoginRequest.getUsername(), userLoginRequest.getPassword());
            logger.info("Saving userLogin...");

            //todo: will store encrypted password later
            userLogin.setPassword(userLoginRequest.getPassword());

            userDao.saveUserLogin(userLogin);

            ObjectMapper mapper = new ObjectMapper();
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            jsonString = mapper.writeValueAsString(userLogin);

        } catch (Exception e) {
            logger.error("login error", e);
            logger.info(methodName + " ends...");
            return new ResponseEntity<String>("error", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        logger.info(methodName + " ends...");
        return new ResponseEntity<String>(jsonString, HttpStatus.OK);
    }

    @ApiOperation(value = "Get user info", response = UserLogin.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved user info"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @RequestMapping(value = "/userLogin", params = {"user"}, method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> getUserLogin(@RequestParam("user") String user) {
        final String methodName = "getUserLogin";
        logger.info(methodName + " starts...");
        UserLogin userLogin = null;
        String jsonString = "";
        if (StringUtils.isNotEmpty(user)) {
            userLogin = userDao.getUserLogin(user);

            try {
                ObjectMapper mapper = new ObjectMapper();
                mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
                jsonString = mapper.writeValueAsString(userLogin);
            } catch (JsonProcessingException e) {
                logger.error("login error", e);
                logger.info(methodName + " ends...");
                return new ResponseEntity("error", HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } else {
            logger.info(methodName + " ends...");
            return new ResponseEntity("error", HttpStatus.NOT_FOUND);
        }
        logger.info(methodName + " ends...");
        return new ResponseEntity<String>(jsonString, HttpStatus.OK);

    }
}
