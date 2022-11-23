package com.sporty.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sporty.entity.AddShoesEntity;
import com.sporty.model.AddShoes;
import com.sporty.model.PurchaseReport;
import com.sporty.repository.ShoesInf;

@Service
public class AdminService {

	@Autowired
	ShoesInf shoesInf;
	
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
}
