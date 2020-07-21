package com.myspring.dashboard.webservices;

import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface UserWebservice {
    @WebMethod
    String hello(@WebParam(name = "name")String name);
}
