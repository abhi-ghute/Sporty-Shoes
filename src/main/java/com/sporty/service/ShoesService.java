package com.sporty.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sporty.entity.AddShoesEntity;
import com.sporty.model.AddShoes;
import com.sporty.repository.ShoesInf;

@Service
public class ShoesService {

	@Autowired
	ShoesInf shoesInf;
	
	public String addShoes(AddShoes shoes, MultipartFile file) throws IOException {
		
		shoes.setImagePath(System.getProperty("user.dir")+"\\src\\main\\resources\\static\\images\\" + file.getOriginalFilename());
		//System.out.println(shoes.getImagePath());
		File savedFile = new File(shoes.getImagePath());
		if (!savedFile.exists()) {
			savedFile.createNewFile();
		}
		FileOutputStream fos = new FileOutputStream(savedFile);
		fos.write(file.getBytes());
		fos.close();
		
		AddShoesEntity entity = new AddShoesEntity();
		BeanUtils.copyProperties(shoes, entity);
		
		shoesInf.save(entity);
		
		return "success";
	}
}
