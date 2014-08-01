/**
 * 2010-1-23
 */
package com.kn.whl.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kn.whl.dao.AccountDao;
import com.kn.whl.entity.Account;
import com.whl.dao.impl.common.BaseDaoImpl;

/**
 * 账户数据库实现
 * 
 * @author <a href="mailto:zlex.dongliang@gmail.com">梁栋</a>
 * @version 1.0
 * @since 1.0
 */
@Repository
public class AccountDaoImpl extends BaseDaoImpl<Account> implements AccountDao {
	protected RowMapper<Account> accountRowMapper = new RowMapper<Account>() {
		@Override
		public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
			Account account = new Account();
			account.setId(rs.getInt("id"));
			account.setUsername(rs.getString("username"));
			account.setPassword(rs.getString("password"));
			account.setBirthday(rs.getDate("birthday"));
			account.setEmail(rs.getString("email"));
			return account;
		}
	};
	@Autowired
	protected void setAccountRowMapper(){
		super.setRowMapper(accountRowMapper);
	}
	
	@Override
	public Account read(String username) {
		String sql = "SELECT * From account WHERE username = ?";
		return (Account) super.getJdbcTemplate().queryForObject(sql,
				new Object[] { username }, accountRowMapper);
	}

	@Override
	public Account read(int id) {
		String sql = "SELECT * From account WHERE id = ?";
		return (Account) super.getJdbcTemplate().queryForObject(sql, new Object[] { id },
				accountRowMapper);
	}
	
	
	
	
}
