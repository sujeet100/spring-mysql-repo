package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.domain.User;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	MySQLRepo mySQLRepo;

	@Override
	public boolean authenticate(String userName, String password) {
	System.out.println("In service");
		mySQLRepo.save(new User("sujit","pass"));
		return true;
	}

}
