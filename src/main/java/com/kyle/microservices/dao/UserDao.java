package com.kyle.microservices.dao;

import com.kyle.microservices.beans.UserLogin;
import com.mongodb.Mongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import java.net.UnknownHostException;

import static org.springframework.data.mongodb.core.query.Criteria.where;

/**
 * Created by Kyle on 9/2/2017.
 */
public class UserDao {
    private @Autowired
    Mongo mongo;

    protected MongoOperations getMongoOperations() {

        return new MongoTemplate(mongo, "workeffort");
    }

    public void saveUserLogin(UserLogin userLogin) throws UnknownHostException {
        if (userLogin != null) {
            this.getMongoOperations().save(userLogin);
        }
    }

    public UserLogin getUserLogin(String userLoginId){
        Query query = new Query(where("userLoginId").is(userLoginId));
        return this.getMongoOperations().findOne(query, UserLogin.class);
    }

}
