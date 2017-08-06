/**
 * UserLoginCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */
package com.kyle.microservices.service.axis2.userLogin;


/**
 *  UserLoginCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class UserLoginCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public UserLoginCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public UserLoginCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for userLogin method
     * override this method for handling normal response from userLogin operation
     */
    public void receiveResultuserLogin(
        com.kyle.microservices.service.axis2.userLogin.UserLoginStub.UserLoginResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from userLogin operation
     */
    public void receiveErroruserLogin(java.lang.Exception e) {
    }
}
