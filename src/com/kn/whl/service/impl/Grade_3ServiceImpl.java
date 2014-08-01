/**
 *三级站点业务层接口实现类
 */
package com.kn.whl.service.impl;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kn.whl.dao.Grade_3Dao;
import com.kn.whl.entity.Grade_3;
import com.kn.whl.service.Grade_3Service;
import com.whl.service.impl.common.BaseServiceImpl;

/**
 * @author hp
 *
 */
@Service
@WebService(serviceName="com.kn.whl.service.Grade_3Service")
@SOAPBinding(style=Style.RPC)
public class Grade_3ServiceImpl extends BaseServiceImpl<Grade_3> implements Grade_3Service {
	@SuppressWarnings("unused")
	private Grade_3Dao grade_3Dao;
	private Grade_3 grade_3;
	@Autowired
	protected void setGrade_3Dao(Grade_3Dao grade_3Dao){
		this.grade_3Dao = grade_3Dao;
		super.setBaseDao(grade_3Dao);
	}
	public Grade_3 getGrade_3(){
		return grade_3;
	}
}
