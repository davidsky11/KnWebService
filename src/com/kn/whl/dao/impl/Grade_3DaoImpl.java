/**
 * 
 */
package com.kn.whl.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kn.whl.dao.Grade_3Dao;
import com.kn.whl.entity.Grade_3;
import com.whl.dao.impl.common.BaseDaoImpl;



/**
 * @author hp
 * 三级级站点接口实现类
 */
@Repository
public class Grade_3DaoImpl extends BaseDaoImpl<Grade_3> implements Grade_3Dao {
	protected RowMapper<Grade_3> grade_3RowMapper = new RowMapper<Grade_3>() {
		
		@Override
		public Grade_3 mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			Grade_3 grade_3 = new Grade_3();
			grade_3.setId(resultSet.getInt("id"));
			grade_3.setGrade_3_name(resultSet.getString("grade_3_name"));
			grade_3.setGrade_2_id(resultSet.getInt("grade_2_id"));
			return grade_3;
		}
	};
	@Autowired
	public void setGrade_3RowMapper(){
		super.setRowMapper(grade_3RowMapper);
	}
}
