/**
 *二级站点业务层接口实现类
 */
package com.kn.whl.service.impl;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kn.whl.dao.Grade_2Dao;
import com.kn.whl.entity.Grade_2;
import com.kn.whl.service.Grade_2Service;
import com.whl.service.impl.common.BaseServiceImpl;

/**
 * @author hp
 *
 */
@Service
@WebService(serviceName="com.kn.whl.service.Grade_2Service")
@SOAPBinding(style=Style.RPC)
public class Grade_2ServiceImpl extends BaseServiceImpl<Grade_2> implements Grade_2Service {
	@SuppressWarnings("unused")
	private Grade_2Dao grade_2Dao;
	private Grade_2 grade_2;
	@Autowired
	protected void setGrade_2Dao(Grade_2Dao grade_2Dao){
		this.grade_2Dao = grade_2Dao;
		super.setBaseDao(grade_2Dao);
	}
	public Grade_2 getGrade_2(){
		return grade_2;
	}
	public List<Grade_2> findGrade_2ListWithForeignKey(@WebParam(name="foreignKey")int foreignKey){
		String sql = "SELECT * FROM grade_2 WHERE grade_1_id = ?";
		List<Grade_2> list = grade_2Dao.find(sql, new Object[]{foreignKey}).gettList();
		return list;
	}
}
