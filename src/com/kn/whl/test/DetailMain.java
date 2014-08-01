package com.kn.whl.test;

import com.kn.whl.entity.Detail;
import com.kn.whl.service.DetailService;
import com.whl.entity.common.Bases;

public class DetailMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DetailService detailService = (DetailService) ClientProxyFactory.instance(DetailService.class,"detail").create();
		Detail detail = new Detail();
		detailService.get(1);
		Bases<Detail> details = detailService.findAll();
		for(Detail d:details.gettList()){
			System.out.println("detail:"+d);
		}
	}

}
