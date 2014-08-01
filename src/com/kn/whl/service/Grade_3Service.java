/**
 * 三级站点业务层接口
 */
package com.kn.whl.service;

import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.kn.whl.entity.Grade_3;
import com.whl.service.common.BaseService;


/**
 * @author hp
 *
 */
@Service
@WebService
public interface Grade_3Service extends BaseService<Grade_3>{
	public Grade_3 getGrade_3();
}
