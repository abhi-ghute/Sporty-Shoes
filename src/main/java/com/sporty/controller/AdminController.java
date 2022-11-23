package com.sporty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sporty.model.PurchaseReport;
import com.sporty.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	AdminService service;
	
	@GetMapping("/report")
	public String getReportData(Model model) {
		
		model.addAttribute("report",new PurchaseReport());
		
		return "PurchaseReportData";
	}
	
	@PostMapping("/getReport")
	public String getReport(@ModelAttribute PurchaseReport report, Model model) {
		
		model.addAttribute("report",service.getReport(report));
		return "PurchaseReport";
	}
}
