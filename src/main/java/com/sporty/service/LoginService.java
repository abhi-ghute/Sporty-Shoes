package com.sporty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sporty.model.Login;
import com.sporty.repository.UserInf;

@Service
public class LoginService {

	@Autowired
	UserInf userInf;
	
	public boolean checkLogin(Login login) {
		
		if(userInf.findByEmailAndPassword(login.getUserName(), login.getPassword()).size()==0)
			return false;
		else
			return true;
	}
}
