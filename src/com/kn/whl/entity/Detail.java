/**
 * 
 */
package com.kn.whl.entity;

import java.io.Serializable;

/**
 * @author hp
 *	三级站点详细实体类
 */
public class Detail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int grade_3_id;
	private String detail_name;
	private String detail_number;
	private String fu_ze_ren;
	private String telephone;
	private String pai_song_fan_wei;
	private String bu_pai_song_fan_wei;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDetail_name() {
		return detail_name;
	}
	public void setDetail_name(String detail_name) {
		this.detail_name = detail_name;
	}
	public String getDetail_number() {
		return detail_number;
	}
	public void setDetail_number(String detail_number) {
		this.detail_number = detail_number;
	}
	public String getFu_ze_ren() {
		return fu_ze_ren;
	}
	public void setFu_ze_ren(String fu_ze_ren) {
		this.fu_ze_ren = fu_ze_ren;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getPai_song_fan_wei() {
		return pai_song_fan_wei;
	}
	public void setPai_song_fan_wei(String pai_song_fan_wei) {
		this.pai_song_fan_wei = pai_song_fan_wei;
	}
	public String getBu_pai_song_fan_wei() {
		return bu_pai_song_fan_wei;
	}
	public void setBu_pai_song_fan_wei(String bu_pai_song_fan_wei) {
		this.bu_pai_song_fan_wei = bu_pai_song_fan_wei;
	}
	public int getGrade_3_id() {
		return grade_3_id;
	}
	public void setGrade_3_id(int grade_3_id) {
		this.grade_3_id = grade_3_id;
	}
	@Override
	public String toString() {
		return "Detail [id=" + id + ", grade_3_id=" + grade_3_id
				+ ", detail_name=" + detail_name + ", detail_number="
				+ detail_number + ", fu_ze_ren=" + fu_ze_ren + ", telephone="
				+ telephone + ", pai_song_fan_wei=" + pai_song_fan_wei
				+ ", bu_pai_song_fan_wei=" + bu_pai_song_fan_wei + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((bu_pai_song_fan_wei == null) ? 0 : bu_pai_song_fan_wei
						.hashCode());
		result = prime * result
				+ ((detail_name == null) ? 0 : detail_name.hashCode());
		result = prime * result
				+ ((detail_number == null) ? 0 : detail_number.hashCode());
		result = prime * result
				+ ((fu_ze_ren == null) ? 0 : fu_ze_ren.hashCode());
		result = prime * result + grade_3_id;
		result = prime * result + id;
		result = prime
				* result
				+ ((pai_song_fan_wei == null) ? 0 : pai_song_fan_wei.hashCode());
		result = prime * result
				+ ((telephone == null) ? 0 : telephone.hashCode());
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
		Detail other = (Detail) obj;
		if (bu_pai_song_fan_wei == null) {
			if (other.bu_pai_song_fan_wei != null)
				return false;
		} else if (!bu_pai_song_fan_wei.equals(other.bu_pai_song_fan_wei))
			return false;
		if (detail_name == null) {
			if (other.detail_name != null)
				return false;
		} else if (!detail_name.equals(other.detail_name))
			return false;
		if (detail_number == null) {
			if (other.detail_number != null)
				return false;
		} else if (!detail_number.equals(other.detail_number))
			return false;
		if (fu_ze_ren == null) {
			if (other.fu_ze_ren != null)
				return false;
		} else if (!fu_ze_ren.equals(other.fu_ze_ren))
			return false;
		if (grade_3_id != other.grade_3_id)
			return false;
		if (id != other.id)
			return false;
		if (pai_song_fan_wei == null) {
			if (other.pai_song_fan_wei != null)
				return false;
		} else if (!pai_song_fan_wei.equals(other.pai_song_fan_wei))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		return true;
	}

}
