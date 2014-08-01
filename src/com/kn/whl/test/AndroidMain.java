package com.kn.whl.test;

import com.kn.whl.entity.Android;
import com.kn.whl.service.AndroidService;

public class AndroidMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AndroidService androidService = (AndroidService) ClientProxyFactory.instance(AndroidService.class,"android").create();
		Android android = androidService.getAndroidVersion();
		System.out.println("Android:"+android);
	}

}
