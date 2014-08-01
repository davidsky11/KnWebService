package com.kn.whl.web.services.impl;  
  

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kn.whl.dao.AccountDao;
import com.kn.whl.entity.Account;
import com.kn.whl.web.services.IHelloServices;
import com.whl.service.impl.common.BaseServiceImpl;
@Service 
@WebService(serviceName="com.ms.services.IHelloServices")
public class HelloServicesImpl extends BaseServiceImpl<Account> implements IHelloServices { 
	@Autowired
	private AccountDao accountDao;
 
    public String sayHello(String name) { 
    	Account account = new Account(); 
    	account.setUsername("china");
    	account.setPassword("password01!");
    	account.setBirthday(new Date());
    	account.setEmail("wanghoulian@outlook.com");
    	accountDao.save(account);
        return "Hello "+name+" ." + account;  
    }  
    
    public Account save(String username, String password, String email, String birthday) throws Exception{
    	Account account  =  new Account();
    	account.setUsername(username);
    	account.setPassword(password);
    	account.setEmail(email);
    	account.setBirthday(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(birthday));
    	accountDao.save(account);
    	return account;
    }
} 