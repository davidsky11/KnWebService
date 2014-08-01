/**
 * 2010-1-23
 */
package com.kn.whl.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * 账户
 * 
 * @author <a href="mailto:zlex.dongliang@gmail.com">梁栋</a>
 * @version 1.0
 * @since 1.0
 */
@Entity
@Table(name = "account")
@XmlRootElement(name="Account")  
@XmlAccessorType(XmlAccessType.FIELD)  
@XmlSeeAlso({Account.class})  
public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -533698031946372178L;

	@Override
	public String toString() {
		return "Account [id=" + id + ", username=" + username + ", password="
				+ password + ", birthday=" + birthday + ", email=" + email
				+ "]";
	}
	
	public Account() {
		super();
	}
	
	public Account(String username) {
		super();
		this.username = username;
	}
	
	public Account(String username, Date birthday, String email) {
		super();
		this.username = username;
		this.birthday = birthday;
		this.email = email;
	}

	/**
	 * 主键
	 */
	private int id;
	
	/**
	 * 用户名
	 */
	private String username;
	
	/**
	 * 密码
	 */
	private String password;

	/**
	 * 生日
	 */
	private Date birthday;

	/**
	 * Email
	 */
	private String email;

	/**
	 * @return the id
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	@Column(name = "username")
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	@Column(name = "password")
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the birthday
	 */
	@Column(name = "birthday")
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday
	 *            the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the email
	 */
	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
