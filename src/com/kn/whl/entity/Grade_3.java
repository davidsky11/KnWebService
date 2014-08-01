/**
 * 
 */
package com.kn.whl.entity;

import java.io.Serializable;

/**
 * @author hp
 *	三级站点实体类
 */
public class Grade_3 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String grade_3_name;
	private int grade_2_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGrade_3_name() {
		return grade_3_name;
	}
	public void setGrade_3_name(String grade_3_name) {
		this.grade_3_name = grade_3_name;
	}
	public int getGrade_2_id() {
		return grade_2_id;
	}
	public void setGrade_2_id(int grade_2_id) {
		this.grade_2_id = grade_2_id;
	}
	@Override
	public String toString() {
		return "Grade_3 [id=" + id + ", grade_3_name=" + grade_3_name
				+ ", grade_2_id=" + grade_2_id + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + grade_2_id;
		result = prime * result
				+ ((grade_3_name == null) ? 0 : grade_3_name.hashCode());
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grade_3 other = (Grade_3) obj;
		if (grade_2_id != other.grade_2_id)
			return false;
		if (grade_3_name == null) {
			if (other.grade_3_name != null)
				return false;
		} else if (!grade_3_name.equals(other.grade_3_name))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
}
