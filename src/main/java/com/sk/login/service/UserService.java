package com.sk.login.service;

import com.sk.login.model.User;

public interface UserService {
	
	public void saveUser(User user);
	
	public User findUserByEmail(String email);

}
