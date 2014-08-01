/**
 * 三级站点明细业务层接口实现类
 */
package com.kn.whl.service.impl;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kn.whl.dao.DetailDao;
import com.kn.whl.entity.Detail;
import com.kn.whl.service.DetailService;
import com.whl.service.impl.common.BaseServiceImpl;

/**
 * @author hp
 *
 */
@Service
@WebService(serviceName="com.kn.whl.service.DetailService")
@SOAPBinding(style=Style.RPC)
public class DetailServiceImpl extends BaseServiceImpl<Detail> implements DetailService {
	
	@SuppressWarnings("unused")
	private DetailDao detailDao;
	private Detail detail;
	@Autowired
	public void setDetailDao(DetailDao detailDao){
		this.detailDao = detailDao;
		super.setBaseDao(detailDao);
	}
	
	public Detail getDetail(){
		return this.detail;
	}
}
