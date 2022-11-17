package com.sporty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sporty.model.User;
import com.sporty.service.UserService;


@Controller
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping("/createuser")
	public String createuserPage(Model model) {
		model.addAttribute("user",new User());
		return "createuser";
	}
	
	@PostMapping("/create")
	public String createUser(@ModelAttribute User user) {
		service.createUser(user);
		return "searchuser";
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