package com.studyroom.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_details")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uId;
	@Column(nullable = false)
	private String uName;
	@Column(nullable = false , unique = false)
	private String uEmail;
	@Column(nullable = false)
	private String uRole;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private String confirmPassword;
	
	
	public User() {
		super();
	}

	public User(int uId, String uName, String uEmail, String uRole, String password, String confirmPassword) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uEmail = uEmail;
		this.uRole = uRole;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	public String getuRole() {
		return uRole;
	}

	public void setuRole(String uRole) {
		this.uRole = uRole;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uEmail=" + uEmail + ", uRole=" + uRole + ", password="
				+ password + ", confirmPassword=" + confirmPassword + "]";
	}
	
}
