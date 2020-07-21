package com.myspring.dashboard.webservices.impl;

import com.myspring.dashboard.webservices.UserWebservice;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

@Service
@WebService(serviceName = "UserWebservice", targetNamespace = "http://webservice.business.longmiss.cn",
        endpointInterface = "com.myspring.dashboard.webservices.UserWebservice")
public class UserWebserviceImpl implements UserWebservice {
    @Override
    public String hello(String name) {
        return "hello"+name;
    }
}
