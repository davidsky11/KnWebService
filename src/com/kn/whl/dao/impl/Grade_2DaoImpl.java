/**
 * 
 */
package com.kn.whl.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kn.whl.dao.Grade_2Dao;
import com.kn.whl.entity.Grade_2;
import com.whl.dao.impl.common.BaseDaoImpl;

/**
 * @author hp 二级站点接口实现类
 */
@Repository
public class Grade_2DaoImpl extends BaseDaoImpl<Grade_2> implements Grade_2Dao {
	protected RowMapper<Grade_2> grade_2RowMapper = new RowMapper<Grade_2>() {
		@Override
		public Grade_2 mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			Grade_2 grade_2 = new Grade_2();
			grade_2.setId(resultSet.getInt("id"));
			grade_2.setGrade_2_name(resultSet.getString("grade_2_name"));
			grade_2.setGrade_1_id(resultSet.getInt("grade_1_id"));
			return grade_2;
		}
	};
	@Autowired
	public void setGrade_2RowMapper(){
		super.setRowMapper(grade_2RowMapper);
	}
}
