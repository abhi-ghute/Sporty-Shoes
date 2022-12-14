package com.sporty.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.jasper.Options;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import com.sporty.entity.AddShoesEntity;
import com.sporty.entity.CartEntity;
import com.sporty.model.AddShoes;
import com.sporty.model.Cart;
import com.sporty.repository.CartRepo;
import com.sporty.repository.ShoesInf;

@Service
public class ShoesService {

	@Autowired
	ShoesInf shoesInf;
	
	@Autowired
	CartRepo cartRepo;

	public String addShoes(AddShoes shoes, MultipartFile file) throws IOException {

		shoes.setImagePath(System.getProperty("user.dir") + "\\src\\main\\resources\\static\\images\\"
				+ file.getOriginalFilename());
		// System.out.println(shoes.getImagePath());
		File savedFile = new File(shoes.getImagePath());
		if (!savedFile.exists()) {
			savedFile.createNewFile();
		}
		FileOutputStream fos = new FileOutputStream(savedFile);
		fos.write(file.getBytes());
		fos.close();

		shoes.setImagePath("images//" + file.getOriginalFilename());
		AddShoesEntity entity = new AddShoesEntity();
		BeanUtils.copyProperties(shoes, entity);

		shoesInf.save(entity);

		return "success";
	}

	public List<AddShoes> getShoes() throws IOException {

		List<AddShoesEntity> shoesList = new ArrayList<>();
		shoesInf.findAll().forEach(shoesList::add);

		List<AddShoes> shoes = new ArrayList<>();

		for (AddShoesEntity entity : shoesList) {
			AddShoes temp = new AddShoes();
			BeanUtils.copyProperties(entity, temp);
			shoes.add(temp);
		}
		return shoes;
	}

	public List<AddShoes> getCartItems(String email) throws IOException {

		List<AddShoesEntity> shoesList = new ArrayList<>();
		shoesInf.getCartItems(email).forEach(shoesList::add);

		List<AddShoes> shoes = new ArrayList<>();

		for (AddShoesEntity entity : shoesList) {
			AddShoes temp = new AddShoes();
			BeanUtils.copyProperties(entity, temp);
			shoes.add(temp);
		}
		return shoes;
	}
	
	public String storeInCart(Cart cart) throws IOException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String today =formatter.format(date);
		System.out.println(today);
		cart.setDate(today);
		CartEntity cartEntity = new CartEntity();
		
		BeanUtils.copyProperties(cart, cartEntity);
		cartRepo.save(cartEntity);
		return "success";
	}
}
