/**
 * 2010-1-23
 */
package com.kn.whl.dao;

import com.kn.whl.entity.Account;
import com.whl.dao.common.BaseDao;

/**
 * 账户数据库接口
 * 
 * @author <a href="mailto:zlex.dongliang@gmail.com">梁栋</a>
 * @version 1.0
 * @since 1.0
 */
public interface AccountDao extends BaseDao<Account>{
	
	
	/**
	 * 读取账户信息
	 * 
	 * @param username
	 * @return
	 */
	Account read(String username);

	/**
	 * 读取账户信息
	 * 
	 * @param id
	 * @return
	 */
	Account read(int id);
	
}
