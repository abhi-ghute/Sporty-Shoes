package com.sporty.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sporty.model.Login;
import com.sporty.model.User;
import com.sporty.service.AdminService;
import com.sporty.service.LoginService;
import com.sporty.service.ShoesService;
import com.sporty.service.UserService;

@Controller
public class LoginController {

	@Autowired
	LoginService service;
	
	@Autowired
	ShoesService shoesService;
	
	@Autowired
	AdminService adminService;
	
	@GetMapping("/login")
	public String loginpage(Model model) {
		model.addAttribute("login",new Login());
		return "login";
	}
	
	@PostMapping("/loginCheck")
	public String loginCheck(@ModelAttribute Login login,HttpSession session,Model model) throws IOException {
		if(login.getUserName().equalsIgnoreCase("admin") && login.getPassword().equals("admin"))	
		{	
			session.setAttribute("user", "admin");
			model.addAttribute("report",adminService.getUsers());
			
			return "Users";
		}else {
			boolean b = service.checkLogin(login);
			if(b==true) {
				session.setAttribute("user", login.getUserName());
				model.addAttribute("shoes",shoesService.getShoes());
			}
			return "index";
		}
	}
	
	@GetMapping("/logout")
	public String logoutPage(Model model,HttpSession session) {
		session.invalidate();
		model.addAttribute("login",new Login());
		return "login";
	}
}
