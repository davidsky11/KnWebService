/**
 * 
 */
package com.kn.whl.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kn.whl.dao.Grade_1Dao;
import com.kn.whl.entity.Grade_1;
import com.whl.dao.impl.common.BaseDaoImpl;

/**
 * @author hp
 * 一级站点接口实现类
 */
@Repository
public class Grade_1DaoImpl extends BaseDaoImpl<Grade_1> implements Grade_1Dao {
	
	protected RowMapper<Grade_1> grade_1RowMapper = new RowMapper<Grade_1>() {
		@Override
		public Grade_1 mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			Grade_1 grade_1 = new Grade_1();
			grade_1.setId(resultSet.getInt("id"));
			grade_1.setGrade_1_name(resultSet.getString("grade_1_name"));
			return grade_1;
		}
	};
	@Autowired
	protected void setGrade_1RowMapper(){
		super.setRowMapper(grade_1RowMapper);
	}
}
