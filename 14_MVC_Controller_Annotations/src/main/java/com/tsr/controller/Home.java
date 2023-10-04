package com.tsr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
	
	@RequestMapping("/home.htm")
	public String homePage() {
		return "index";
	}
}
