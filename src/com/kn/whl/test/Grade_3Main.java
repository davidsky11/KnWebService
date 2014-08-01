package com.kn.whl.test;

import com.kn.whl.entity.Grade_3;
import com.kn.whl.service.Grade_3Service;
import com.whl.entity.common.Bases;

public class Grade_3Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Grade_3Service grade_3Service = (Grade_3Service) ClientProxyFactory.instance(Grade_3Service.class,"grade_3").create();
		Bases<Grade_3> grade_3s = grade_3Service.findAll();
		for(Grade_3 grade_3:grade_3s.gettList()){
			System.out.println("打印："+grade_3);
		}
		Bases<Grade_3> grade_3ss = grade_3Service.findEntityListByForeignKey("grade_2_id", 6);
		for(Grade_3 grade_3:grade_3ss.gettList()){
			System.out.println("打印："+grade_3);
		}
	}

}
