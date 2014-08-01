package com.kn.whl.test;

import com.kn.whl.entity.Grade_1;
import com.kn.whl.service.Grade_1Service;
import com.whl.entity.common.Bases;

public class Grade_1Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Grade_1Service grade_1Service = (Grade_1Service) ClientProxyFactory.instance(Grade_1Service.class,"grade_1").create();
		Bases<Grade_1> grade_1s = grade_1Service.findAll();
		for(Grade_1 grade_1:grade_1s.gettList()){
			System.out.println("打印："+grade_1);
		}
	}

}
