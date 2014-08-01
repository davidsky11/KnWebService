/**
 * 二级站点业务层接口
 */
package com.kn.whl.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.kn.whl.entity.Grade_2;
import com.whl.service.common.BaseService;

@Service
@WebService
public interface Grade_2Service extends BaseService<Grade_2> {
	public Grade_2 getGrade_2();
	@WebMethod(operationName="findGrade_2ListWithForeignKey")
	public List<Grade_2> findGrade_2ListWithForeignKey(@WebParam(name="foreignKey")int foreignKey);
}
