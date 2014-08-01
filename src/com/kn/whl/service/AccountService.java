/**
 * 2010-1-23
 */
package com.kn.whl.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.kn.whl.entity.Account;
import com.whl.service.common.BaseService;

/**
 * 账户业务接口
 * 
 * @author <a href="mailto:zlex.dongliang@gmail.com">梁栋</a>
 * @version 1.0
 * @since 1.0
 */
@Service
@WebService
public interface AccountService extends BaseService<Account> {

	/**
	 * 获得账户
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	@WebMethod(operationName="readWithUsernameAndPassword")
	Account read(String username, String password);

	/**
	 * 获得账户
	 * 
	 * @param id
	 * @return
	 */
	@WebMethod(operationName="readWithId")
	Account read(@WebParam(name="id")int id);
	
	Account getAccount();
	
	Account findAccountByUsername(@WebParam(name="name")String name);
	@WebMethod(operationName="findAccountById")
	Account findAccountById(@WebParam(name="id") int id);
	public String getClient(@WebParam(name="client")String client);
}
