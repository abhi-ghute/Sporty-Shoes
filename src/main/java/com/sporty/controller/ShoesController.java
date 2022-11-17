package com.sporty.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.sporty.model.AddShoes;
import com.sporty.service.ShoesService;

@Controller
public class ShoesController {

	@Autowired
	ShoesService service;
	
	@GetMapping("/shoes")
	public String addShoesPage(Model model) {
		AddShoes shoes = new AddShoes();
		model.addAttribute("shoes",shoes);
		return "addShoesPage";
	}
	
	@PostMapping("/addshoes")
	public String addShoes(@ModelAttribute AddShoes addShoes, @RequestParam MultipartFile image) throws IOException {
		service.addShoes(addShoes,image);
		return "home";
	}
}
