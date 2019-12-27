package com.ats.service;

import com.ats.command.UserCommand;

public interface UsersManagementRegisterService {
	
	public boolean registerUser(UserCommand userCommand);
	
	public boolean unlockUserAccount(UserCommand userCommand);
	
	public UserCommand getUserDetailsById();
	
}//interface
