package com.kn.whl.test;

import java.util.Date;

import com.kn.whl.entity.Account;
import com.kn.whl.service.AccountService;
import com.whl.entity.common.Bases;

public class AccountMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AccountService accountService = (AccountService) ClientProxyFactory.instance(AccountService.class,"account").create();
		Account account = new Account();
		account.setId(9);
		account.setUsername("XYZ");
		account.setPassword("xyw");
		account.setBirthday(new Date());
		account.setEmail("o@outlook.com");
		//accountService.save(account);
		//accountService.delete(2);
		Account acc = accountService.get(1);
		System.out.println("get:"+acc);
		Bases<Account> accounts = accountService.findAll();
		for(Account a :accounts.gettList()){
			System.out.println(a.toString());
		}
		
		Account acco = accountService.findAccountByUsername("08580101");
		System.out.println("acco:"+accountService.getClient(acco.getUsername()));
	}

}
