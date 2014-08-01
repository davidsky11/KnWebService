package com.kn.whl.entity;

import java.io.Serializable;
import java.util.Date;

public class Android implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String versionCode;
	private String versionName;
	private Date versionDate;
	public String getVersionCode() {
		return versionCode;
	}
	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}
	public String getVersionName() {
		return versionName;
	}
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}
	public Date getVersionDate() {
		return versionDate;
	}
	public void setVersionDate(Date versionDate) {
		this.versionDate = versionDate;
	}
	@Override
	public String toString() {
		return "Android [versionCode=" + versionCode + ", versionName="
				+ versionName + ", versionDate=" + versionDate + "]";
	}
	
}
