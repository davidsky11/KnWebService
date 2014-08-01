package com.kn.whl.test;

import com.kn.whl.entity.Grade_2;
import com.kn.whl.service.Grade_2Service;
import com.whl.entity.common.Bases;

public class Grade_2Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Grade_2Service grade_2Service = (Grade_2Service) ClientProxyFactory.instance(Grade_2Service.class,"grade_2").create();
		Bases<Grade_2> grade_2s = grade_2Service.findAll();
		for(Grade_2 grade_2:grade_2s.gettList()){
			System.out.println("打印："+grade_2);
		}
		/*String sql = "SELECT * FROM grade_2 WHERE grade_1_id = ?";
		Object[] paramValues = new Object[]{"1"};
		List<Grade_2> grade_2ss = grade_2Service.findGrade_2ListWithForeignKey(1);
		for(Grade_2 grade_2:grade_2ss){
			System.out.println("打印："+grade_2);
		}*/
		Bases<Grade_2> grade_2ss = grade_2Service.findEntityListByForeignKey("grade_1_id", 1);
		for(Grade_2 grade_2:grade_2ss.gettList()){
			System.out.println("打印："+grade_2);
		}
	}

}
