package com.ats.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ats.command.UserCommand;
import com.ats.repository.UsersRegisterRepository;
@Service	
public class UsersManagementRegistrationServiceImpl implements UsersManagementRegisterService {

	@Autowired
	private UsersRegisterRepository usersRegisterRepository;
	@Override
	public boolean registerUser(UserCommand userCommand) {
		// TODO Auto-generated method stub
		return false;
	}//registerUser(-)

	@Override
	public boolean unlockUserAccount(UserCommand userCommand) {
		// TODO Auto-generated method stub
		return false;
	}//UserCommand(-)

	@Override
	public UserCommand getUserDetailsById() {
		// TODO Auto-generated method stub
		return null;
	}//getUserDetailsById()
	
}//class
