package com.kyle.microservices.beans;

import lombok.Data;

/**
 * Created by Kyle on 8/7/2017.
 */
public @Data class UserLogin extends AbsractBean {
    private String userLoginId;
    private String partyId;
//    private String currentPassword;
    private String enabled;
    private String hasLoggedOut;
    private String successiveFailedLogins;
    private String lastUpdatedTxStamp;
    private String lastUpdatedStamp;
    private String createdStamp;
    private String createdTxStamp;

}
