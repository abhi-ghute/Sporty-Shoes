package com.sporty.service;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sporty.entity.UserEntity;
import com.sporty.model.User;
import com.sporty.repository.UserInf;


@Service
public class UserService {

	@Autowired
	UserInf userRepo;

	public String createUser(User user) {

		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);

		//userRepo.save(userEntity);

		return "success";
	}

//	public User getUser(String sid) {
//	 	List<UserEntity> listentity= userRepo.findByStudentID(sid);
//	 	User user = new User();
//	 	
//	 	if(listentity.size()==0) {
//	 		System.out.println("nnoll");
//	 		return user;
//	 	}
//	 	
//		BeanUtils.copyProperties(listentity.get(0), user);
//		
//
//		return user;
//	}
}