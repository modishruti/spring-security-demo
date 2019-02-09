package com.example.springsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TestController {

	@GetMapping("/home")
	public String home() {
		return "home.html";
	}
	
	@GetMapping("/secure/photos")
	public String photos() {		
		return "photos.html";
	}

	@GetMapping("/secure/test")
	public String test() {
		return "test.html";
	}
	
	@GetMapping("/secure/test2")
	public String test2() {
		return "secure/test2.html";
	}
	
	@GetMapping("/secure/test3")
	public String test3() {
		return "test3.html";
	}
	
	@GetMapping("/")
	public String homelink() {
		return "homelink.html";
	}
}
