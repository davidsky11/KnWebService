/**
 * 一级站点业务层接口
 */
package com.kn.whl.service;

import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.kn.whl.entity.Grade_1;
import com.whl.service.common.BaseService;


/**
 * @author hp
 * 
 */
@Service
@WebService
public interface Grade_1Service extends BaseService<Grade_1>{
	public Grade_1 getGrade_1();
	
}
