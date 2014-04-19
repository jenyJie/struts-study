package com.mxj.ssh.action;

import java.sql.DriverManager;

import com.mxj.ssh.beans.UserForm;
import com.mxj.ssh.service.UserManager;
import com.mxj.ssh.serviceImpl.UserManagerImpl;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{

	/**    
	 * serialVersionUID:TODO（用一句话描述这个变量表示什么）    
	 */    
	
	private static final long serialVersionUID = 1L;
	private UserForm user;
	private UserManager userManager;
	public UserForm getUser() {
		return user;
	}
	public void setUser(UserForm user) {
		this.user = user;
	}
	public UserManager getUserManager() {
		return userManager;
	}
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	
	
	
	
	public String execute(){
/*		String url= "jdbc:mysql://localhost:3306/";
		String dbName = "sshtest";
		String driverName = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "";
		Connection conn = null;
		Statement stmt = null;
		try{
			Class.forName(driverName).newInstance();
			conn = (Connection) DriverManager.getConnection(url + dbName,userName,password);
			stmt = (Statement) conn.createStatement();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		*/
		
		
		try{
			this.setUserManager(new UserManagerImpl());
			userManager.regUser(user);
			return SUCCESS;
		}
		catch(Exception e){
			e.printStackTrace();
			return ERROR;
		}
		
	}
}
