package com.kyle.microservices.service.axis2.userLogin;

import com.kyle.microservices.UserServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * UserLoginTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */


/*
 *  UserLoginTest Junit test case
 */
public class UserLoginTest extends junit.framework.TestCase {
    @Value("${business.endpoint.host}")
    private String service_host;
    @Value("${business.endpoint.port}")
    private String service_port;
    private static final String service_endpoint = "http://192.168.20.9:8080/webtools/control/SOAPService";

    /**
     * Auto generated test method
     */
    public void testuserLogin() throws java.lang.Exception {
        com.kyle.microservices.service.axis2.userLogin.UserLoginStub stub = new com.kyle.microservices.service.axis2.userLogin.UserLoginStub(service_endpoint); //the default implementation should point to the right endpoint

        com.kyle.microservices.service.axis2.userLogin.UserLoginStub.UserLogin userLogin4 =
                (com.kyle.microservices.service.axis2.userLogin.UserLoginStub.UserLogin) getTestObject(com.kyle.microservices.service.axis2.userLogin.UserLoginStub.UserLogin.class);


        UserLoginStub.MapMap mapMap = new UserLoginStub.MapMap();

        UserLoginStub.MapEntry mapEntry = new UserLoginStub.MapEntry();
        UserLoginStub.MapKey mapKey = new UserLoginStub.MapKey();
        UserLoginStub.StdString_type0 stdString = new UserLoginStub.StdString_type0();
        stdString.setValue("login.username");
        mapKey.setStdString(stdString);
        mapEntry.setMapKey(mapKey);

        UserLoginStub.MapValue mapValue = new UserLoginStub.MapValue();
        UserLoginStub.StdString_type0 stdStringValue = new UserLoginStub.StdString_type0();
        stdStringValue.setValue("admin");
        mapValue.setStdString(stdStringValue);
        mapEntry.setMapValue(mapValue);

        UserLoginStub.MapEntry mapEntry1 = new UserLoginStub.MapEntry();
        UserLoginStub.MapKey mapKey1 = new UserLoginStub.MapKey();
        UserLoginStub.StdString_type0 stdString1 = new UserLoginStub.StdString_type0();
        stdString1 .setValue("login.password");
        mapKey1.setStdString(stdString1);
        mapEntry1.setMapKey(mapKey1);

        UserLoginStub.MapValue mapValue1 = new UserLoginStub.MapValue();
        UserLoginStub.StdString_type0 stdStringValue1 = new UserLoginStub.StdString_type0();
        stdStringValue1.setValue("ofbiz");
        mapValue1.setStdString(stdStringValue1);
        mapEntry1.setMapValue(mapValue1);

        UserLoginStub.MapEntry[] mapEntries = new UserLoginStub.MapEntry[]{mapEntry, mapEntry1};
        mapMap.setMapEntry(mapEntries);
        userLogin4.setMapMap(mapMap);

        UserLoginStub.UserLoginResponse userLoginResponse = stub.userLogin(userLogin4);

        assertNotNull(stub.userLogin(userLogin4));
    }


    /**
     * Auto generated test method
     */
    public void testStartuserLogin() throws java.lang.Exception {
        com.kyle.microservices.service.axis2.userLogin.UserLoginStub stub = new com.kyle.microservices.service.axis2.userLogin.UserLoginStub();
        com.kyle.microservices.service.axis2.userLogin.UserLoginStub.UserLogin userLogin4 =
                (com.kyle.microservices.service.axis2.userLogin.UserLoginStub.UserLogin) getTestObject(com.kyle.microservices.service.axis2.userLogin.UserLoginStub.UserLogin.class);
        // TODO : Fill in the userLogin4 here
        stub.startuserLogin(userLogin4, new tempCallbackN1000C());
    }

    //Create an ADBBean and provide it as the test object
    public org.apache.axis2.databinding.ADBBean getTestObject(
            java.lang.Class type) throws java.lang.Exception {
        return (org.apache.axis2.databinding.ADBBean) type.newInstance();
    }

    private class tempCallbackN1000C extends com.kyle.microservices.service.axis2.userLogin.UserLoginCallbackHandler {
        public tempCallbackN1000C() {
            super(null);
        }

        public void receiveResultuserLogin(
                com.kyle.microservices.service.axis2.userLogin.UserLoginStub.UserLoginResponse result) {
        }

        public void receiveErroruserLogin(java.lang.Exception e) {
            fail();
        }
    }
}
