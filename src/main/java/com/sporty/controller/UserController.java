package com.sporty.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sporty.model.Cart;
import com.sporty.model.User;
import com.sporty.service.ShoesService;
import com.sporty.service.UserService;


@Controller
public class UserController {

	@Autowired
	UserService service;
	
	@Autowired
	ShoesService shoesService;

	
	@GetMapping("/createuser")
	public String createuserPage(Model model) {
		model.addAttribute("user",new User());
		return "createuser";
	}
	
	@PostMapping("/create")
	public String createUser(@ModelAttribute User user,Model model) throws IOException {
		service.createUser(user);
		model.addAttribute("shoes",shoesService.getShoes());
		return "index";
	}
	
	@GetMapping("/cart")
	public String cartPage(Model model) throws IOException {
		return "cart";
	}
	
	@GetMapping("/cartStore")
	public String cartStore(@RequestParam("name") String name, Model model,Cart cart,HttpSession session) throws IOException {
		
		cart.setEmail((String)session.getAttribute("user"));
		cart.setShooetype(name);
		return "cart";
	}
	
//	@PostMapping("/search")
//	public String getUser(@RequestParam String sid,Model model) {
//			
//		User user = service.getUser(sid);
//		model.addAttribute("user",user);
//		
//		return "updateuser";
//
//	}
//	
//	@PostMapping("/update")
//	public String updateUser(@ModelAttribute User user) {
//		service.createUser(user);
//		return "searchuser";
//	}
	
	
}