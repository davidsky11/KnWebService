package com.kn.whl.test;

import com.kn.whl.entity.Account;

@javax.jws.WebService(targetNamespace = "http://test.whl.kn.com/", serviceName = "AccountClientService", portName = "AccountClientPort", wsdlLocation = "WEB-INF/wsdl/AccountClientService.wsdl")
public class AccountClientDelegate {

	com.kn.whl.test.AccountClient accountClient = new com.kn.whl.test.AccountClient();

	public Account findAccount(String name) {
		return accountClient.findAccount(name);
	}

}