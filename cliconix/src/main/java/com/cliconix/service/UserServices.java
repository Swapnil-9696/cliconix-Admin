package com.cliconix.service;

import java.util.List;

import com.cliconix.model.User;

public interface UserServices {

	List<User> showUserServ();
	
	void insertBuyerServe(User user);
	
	void deleteBuyerServe(int ids);
	
	void editUserServe(User user);

		

}
