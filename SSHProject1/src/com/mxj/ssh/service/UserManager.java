package com.mxj.ssh.service;

import com.mxj.ssh.beans.UserForm;

/**    
 * @author：马洁    
 * @since：2014-4-17 下午10:46:57 
 * @version:   
 */
public interface UserManager {
	//业务逻辑接口层
	public void regUser(UserForm user);
	
}
