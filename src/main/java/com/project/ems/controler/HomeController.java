package com.project.ems.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ems.service.EmployeeService;

@RestController
public class HomeController {
	
	EmployeeService emplyeeService;
	
	@GetMapping("/test")
	public String test() {
		return "Hello";
		
	}

}
