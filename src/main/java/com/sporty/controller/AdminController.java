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

import com.sporty.model.Login;
import com.sporty.model.PurchaseReport;
import com.sporty.model.User;
import com.sporty.service.AdminService;
import com.sporty.service.UserService;

@Controller
public class AdminController {

	@Autowired
	AdminService service;
	
	@Autowired
	UserService userService;
	
	@GetMapping("/report")
	public String getReportData(Model model,HttpSession session) {
		
		String admin = (String)session.getAttribute("user");
		if(admin==null || !admin.equals("admin")) {
			model.addAttribute("login",new Login());
			return "login";
		}
		model.addAttribute("report",new PurchaseReport());
		
		return "PurchaseReportData";
	}
	
	@PostMapping("/getReport")
	public String getReport(@ModelAttribute PurchaseReport report, Model model,HttpSession session) {
		String admin = (String)session.getAttribute("user");
		if(admin==null || !admin.equals("admin")) {
			model.addAttribute("login",new Login());
			return "login";
		}
		model.addAttribute("report",service.getReport(report));
		return "PurchaseReport";
	}
	
	@GetMapping("/users")
	public String getUsers(Model model ,HttpSession session) throws IOException {
		String admin = (String)session.getAttribute("user");
		if(admin==null || !admin.equals("admin")) {
			model.addAttribute("login",new Login());
			return "login";
		}
		model.addAttribute("report",service.getUsers());
		
		return "Users";
	}
	
	@GetMapping("/searchuser")
	public  String searchUserPage(HttpSession session,Model model) {
		String admin = (String)session.getAttribute("user");
		if(admin==null || !admin.equals("admin")) {
			model.addAttribute("login",new Login());
			return "login";
		}
		return "searchuser";
	}
	
	@PostMapping("/search")
	public String getUser(@RequestParam String email,Model model,HttpSession session) {
		String admin = (String)session.getAttribute("user");
		if(admin==null || !admin.equals("admin")) {
			model.addAttribute("login",new Login());
			return "login";
		}
		User user = userService.getUser(email);
		model.addAttribute("user",user);
		
		return "viewUser";

	}
}
