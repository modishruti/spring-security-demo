package com.example.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/rest")
@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/all")
	public String all() {
		return "Hello All";
	}
	
	@GetMapping("/secure/all")
	public String secureAll(){
		return "Hello Secured All";
	}
}
