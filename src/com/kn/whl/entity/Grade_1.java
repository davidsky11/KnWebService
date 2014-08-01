/**
 * 
 */
package com.kn.whl.entity;

import java.io.Serializable;

/**
 * @author hp
 *	一级站点实体类
 */
public class Grade_1 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String grade_1_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGrade_1_name() {
		return grade_1_name;
	}
	public void setGrade_1_name(String grade_1_name) {
		this.grade_1_name = grade_1_name;
	}
	@Override
	public String toString() {
		return "Grade_1 [id=" + id + ", grade_1_name=" + grade_1_name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((grade_1_name == null) ? 0 : grade_1_name.hashCode());
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
		Grade_1 other = (Grade_1) obj;
		if (grade_1_name == null) {
			if (other.grade_1_name != null)
				return false;
		} else if (!grade_1_name.equals(other.grade_1_name))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
}
