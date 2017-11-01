package com.kyle.microservices.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public abstract class AbstractBusinessService {
    @Value("${business.endpoint.host}")
    private String service_host;
    @Value("${business.endpoint.port}")
    private String service_port;

    protected String service_endpoint = "http://"+service_host+":"+service_port+"/webtools/control/SOAPService";
}
