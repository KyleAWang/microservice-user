package com.kyle.microservices.beans;

import lombok.Data;

/**
 * Created by Kyle on 8/8/2017.
 */
public @Data abstract class AbsractBean {
    private String responseMessage;
    private String errorMessage;
}
