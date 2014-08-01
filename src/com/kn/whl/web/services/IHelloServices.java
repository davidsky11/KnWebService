package com.kn.whl.web.services;  
  
import javax.jws.WebService;

import com.kn.whl.entity.Account;
import com.whl.service.common.BaseService;
  
@WebService  
public interface IHelloServices extends BaseService<Account>{  
    public String sayHello(String name);
    public Account save(String username, String password, String email, String birthday) throws Exception;
}