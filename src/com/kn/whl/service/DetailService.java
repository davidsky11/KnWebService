/**
 * 三级站点明细业务层接口
 */
package com.kn.whl.service;

import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.kn.whl.entity.Detail;
import com.whl.service.common.BaseService;


/**
 * @author hp
 *
 */
@Service
@WebService
public interface DetailService extends BaseService<Detail> {
	public Detail getDetail();
}
