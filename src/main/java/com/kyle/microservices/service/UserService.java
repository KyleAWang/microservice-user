package com.kyle.microservices.service;

import com.kyle.microservices.beans.UserLogin;
import com.kyle.microservices.service.axis2.userLogin.UserLoginStub;
import org.apache.axis2.AxisFault;
import org.apache.axis2.databinding.ADBBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.rmi.RemoteException;
import java.util.logging.Logger;

/**
 * Created by Kyle on 8/7/2017.
 */
@Service
public class UserService {
    private Logger logger = Logger.getLogger(UserService.class.getName());
    @Value("${business.endpoint.host}")
    private String service_host;
    @Value("${business.endpoint.port}")
    private String service_port;

    public UserLogin userLogin(String userName, String password) throws Exception {
        String service_endpoint = "http://"+service_host+":"+service_port+"/webtools/control/SOAPService";

        UserLoginStub stub = new UserLoginStub(service_endpoint); //the default implementation should point to the right endpoint

        UserLoginStub.UserLogin userLogin4 =
                (UserLoginStub.UserLogin) getTypeObject(UserLoginStub.UserLogin.class);


        UserLoginStub.MapMap mapMap = new UserLoginStub.MapMap();

        UserLoginStub.MapEntry mapEntry = new UserLoginStub.MapEntry();
        UserLoginStub.MapKey mapKey = new UserLoginStub.MapKey();
        UserLoginStub.StdString_type0 stdString = new UserLoginStub.StdString_type0();
        stdString.setValue("login.username");
        mapKey.setStdString(stdString);
        mapEntry.setMapKey(mapKey);

        UserLoginStub.MapValue mapValue = new UserLoginStub.MapValue();
        UserLoginStub.StdString_type0 stdStringValue = new UserLoginStub.StdString_type0();
        stdStringValue.setValue(userName);
        mapValue.setStdString(stdStringValue);
        mapEntry.setMapValue(mapValue);

        UserLoginStub.MapEntry mapEntry1 = new UserLoginStub.MapEntry();
        UserLoginStub.MapKey mapKey1 = new UserLoginStub.MapKey();
        UserLoginStub.StdString_type0 stdString1 = new UserLoginStub.StdString_type0();
        stdString1.setValue("login.password");
        mapKey1.setStdString(stdString1);
        mapEntry1.setMapKey(mapKey1);

        UserLoginStub.MapValue mapValue1 = new UserLoginStub.MapValue();
        UserLoginStub.StdString_type0 stdStringValue1 = new UserLoginStub.StdString_type0();
        stdStringValue1.setValue(password);
        mapValue1.setStdString(stdStringValue1);
        mapEntry1.setMapValue(mapValue1);

        UserLoginStub.MapEntry[] mapEntries = new UserLoginStub.MapEntry[]{mapEntry, mapEntry1};
        mapMap.setMapEntry(mapEntries);
        userLogin4.setMapMap(mapMap);

        UserLoginStub.UserLoginResponse userLoginResponse = stub.userLogin(userLogin4);

        UserLoginStub.MapEntry[] entries = userLoginResponse.getMapHashMap().getMapEntry();

        UserLogin userLogin = new UserLogin();
        for(UserLoginStub.MapEntry entry : entries) {
            String key = entry.getMapKey().getStdString().getValue();
            UserLoginStub.MapValue value = entry.getMapValue();
            if (key.equals("userLogin")) {
                convertToBean(entry.getMapValue().getEevalUserLogin(), userLogin);
            } else if (key.equals("responseMessage")) {
                userLogin.setResponseMessage(value.getStdString().getValue());
            } else if (key.equals("errorMessage")) {
                userLogin.setErrorMessage(value.getStdString().getValue());
            }
        }
        return  userLogin;
    }

    private void convertToBean(UserLoginStub.EevalUserLogin_type0 item, UserLogin userLogin) {

        if (item.getCreatedStamp() != null) {
            userLogin.setCreatedStamp(item.getCreatedStamp());
        }
        if (item.getCreatedTxStamp() != null) {
            userLogin.setCreatedTxStamp(item.getCreatedTxStamp());
        }
//        if (item.getCurrentPassword() != null) {
//            userLogin.setCurrentPassword(item.getCurrentPassword());
//        }
        if (item.getEnabled() != null) {
            userLogin.setEnabled(item.getEnabled());
        }
        if (item.getHasLoggedOut() != null) {
            userLogin.setHasLoggedOut(item.getHasLoggedOut());
        }
        if (item.getLastUpdatedStamp() != null) {
            userLogin.setLastUpdatedStamp(item.getLastUpdatedStamp());
        }
        if (item.getLastUpdatedTxStamp() != null) {
            userLogin.setLastUpdatedTxStamp(item.getLastUpdatedTxStamp());
        }
        if (item.getPartyId() != null) {
            userLogin.setPartyId(item.getPartyId());
        }
        if (item.getSuccessiveFailedLogins() != null) {
            userLogin.setSuccessiveFailedLogins(item.getSuccessiveFailedLogins());
        }
        if (item.getUserLoginId() != null) {
            userLogin.setUserLoginId(item.getUserLoginId());
        }
    }


    //Create an ADBBean and provide it as the test object
    public ADBBean getTypeObject(
            Class type) throws Exception {
        return (ADBBean) type.newInstance();
    }
}
