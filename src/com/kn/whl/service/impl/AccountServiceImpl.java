/**
 * 2010-1-23
 */
package com.kn.whl.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kn.whl.dao.AccountDao;
import com.kn.whl.entity.Account;
import com.kn.whl.service.AccountService;
import com.whl.service.impl.common.BaseServiceImpl;

/**
 * 账户业务
 * 
 * @author <a href="mailto:zlex.dongliang@gmail.com">梁栋</a>
 * @version 1.0
 * @since 1.0
 */
@Service
@WebService(serviceName="com.kn.whl.service.AccountService")
@SOAPBinding(style=Style.RPC)
public class AccountServiceImpl extends BaseServiceImpl<Account> implements AccountService {

	private AccountDao accountDao;
	private Account account;
	
	@Autowired
	public void setAccountDao(AccountDao accountDao){
		this.accountDao = accountDao;
		super.setBaseDao(accountDao);
	}
	
	@Override
	@WebMethod(operationName = "readWithUsernameAndPassword")
	public Account read(String username, String password) {
		Account account = accountDao.read(username);

		if (!password.equals(account.getPassword())) {
			account = null;
		}
		return account;
	}

	@Override
	@WebMethod(operationName = "readWithId")
	public Account read(int id) {
		return accountDao.read(id);
	}
	
	@Override
	public Account getAccount() {
		return account;
	}
	
	@Override
	public Account findAccountByUsername(String name){
		System.out.println("Android Client:"+name);
		String sql = "select * from account where username = ?" ;
		return accountDao.findUnique(sql, name);
	}
	
	@Override
	public Account findAccountById(int id){
		return accountDao.get(id);
	}
	
	@Override
	public String getClient(String client){
		System.out.println("Client:"+client);
		return "Client:" + client;
	}

}
