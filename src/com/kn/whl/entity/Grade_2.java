/**
 * 
 */
package com.kn.whl.entity;

import java.io.Serializable;

/**
 * @author hp
 *二级站点实体类
 */
public class Grade_2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id ;
	private String grade_2_name;
	private int grade_1_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGrade_2_name() {
		return grade_2_name;
	}
	public void setGrade_2_name(String grade_2_name) {
		this.grade_2_name = grade_2_name;
	}
	public int getGrade_1_id() {
		return grade_1_id;
	}
	public void setGrade_1_id(int grade_1_id) {
		this.grade_1_id = grade_1_id;
	}
	@Override
	public String toString() {
		return "Grade_2 [id=" + id + ", grade_2_name=" + grade_2_name
				+ ", grade_1_id=" + grade_1_id + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + grade_1_id;
		result = prime * result
				+ ((grade_2_name == null) ? 0 : grade_2_name.hashCode());
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
		Grade_2 other = (Grade_2) obj;
		if (grade_1_id != other.grade_1_id)
			return false;
		if (grade_2_name == null) {
			if (other.grade_2_name != null)
				return false;
		} else if (!grade_2_name.equals(other.grade_2_name))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	

}
