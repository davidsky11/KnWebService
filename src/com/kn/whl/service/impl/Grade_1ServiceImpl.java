/**
 *一级站点业务层接口实现类
 */
package com.kn.whl.service.impl;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kn.whl.dao.Grade_1Dao;
import com.kn.whl.entity.Grade_1;
import com.kn.whl.service.Grade_1Service;
import com.whl.service.impl.common.BaseServiceImpl;

/**
 * @author hp
 *
 */
@Service
@WebService(serviceName="com.kn.whl.service.Grade_1Service")
@SOAPBinding(style=Style.RPC)
public class Grade_1ServiceImpl extends BaseServiceImpl<Grade_1> implements Grade_1Service {
	@SuppressWarnings("unused")
	private Grade_1Dao grade_1Dao;
	private Grade_1 grade_1;
	@Autowired
	public void setGrade_1Dao(Grade_1Dao grade_1Dao){
		this.grade_1Dao = grade_1Dao;
		super.setBaseDao(grade_1Dao);
	}
	public Grade_1 getGrade_1(){
		return grade_1;
	}
	
}
