package com.sporty.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sporty.entity.AddShoesEntity;
import com.sporty.entity.UserEntity;
import com.sporty.model.AddShoes;
import com.sporty.model.PurchaseReport;
import com.sporty.model.User;
import com.sporty.repository.ShoesInf;
import com.sporty.repository.UserInf;

@Service
public class AdminService {

	@Autowired
	ShoesInf shoesInf;
	
	@Autowired
	UserInf userInf;
	
	public List<AddShoes> getReport(PurchaseReport report){
		
		List<AddShoesEntity> shoesList = new ArrayList<>();
		shoesInf.getReport(report.getFrom(),report.getTo(),report.getType()).forEach(shoesList::add);
		List<AddShoes> shoes = new ArrayList<>();

		for (AddShoesEntity entity : shoesList) {
			AddShoes temp = new AddShoes();
			BeanUtils.copyProperties(entity, temp);
			shoes.add(temp);
		}
		
		return shoes;
	}
	
	public List<User> getUsers() throws IOException {

		List<UserEntity> userList = new ArrayList<>();
		userInf.findAll().forEach(userList::add);

		List<User> users = new ArrayList<>();

		for (UserEntity entity : userList) {
			User temp = new User();
			BeanUtils.copyProperties(entity, temp);
			users.add(temp);
		}
		return users;
	}
}
