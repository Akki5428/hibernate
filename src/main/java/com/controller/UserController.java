package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.entity.UserEntity;



@Controller
public class UserController {
	
	@GetMapping("/newuser")
	public String userlogin() {
		return "NewUser";
	}
	
	@PostMapping("/loginuser")
	public String postMethodName(UserEntity entity) {
		System.out.println(entity.getEmail());
		
		return "NewUser";
	}
	
}
