/**
 * 
 */
package com.kn.whl.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kn.whl.dao.DetailDao;
import com.kn.whl.entity.Detail;
import com.whl.dao.impl.common.BaseDaoImpl;

/**
 * @author hp
 * 三级站点详细接口实现类
 */
@Repository
public class DetailDaoImpl extends BaseDaoImpl<Detail> implements DetailDao {
	protected RowMapper<Detail> detailRowMapper = new RowMapper<Detail>() {
		@Override
		public Detail mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			Detail detail = new Detail();
			detail.setId(resultSet.getInt("id"));
			detail.setGrade_3_id(resultSet.getInt("grade_3_id"));
			detail.setDetail_name(resultSet.getString("detail_name"));
			detail.setDetail_number(resultSet.getString("detail_number"));
			detail.setTelephone(resultSet.getString("telephone"));
			detail.setFu_ze_ren(resultSet.getString("fu_ze_ren"));
			detail.setPai_song_fan_wei(resultSet.getString("pai_song_fan_wei"));
			detail.setBu_pai_song_fan_wei(resultSet.getString("bu_pai_song_fan_wei"));
			return detail;
		}
	}; 
	@Autowired
	protected void setDetailRowMapper(){
		super.setRowMapper(detailRowMapper);
	}
}
