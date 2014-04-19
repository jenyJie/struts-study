package com.mxj.ssh.beans;

/**
 * @author：马洁
 * @since：2014-4-17 下午10:26:34
 * @version:
 */
public class UserForm {
	//用户表单类
	private String username;
	private String password;
	private int gender;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}
}
