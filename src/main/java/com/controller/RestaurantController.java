package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.RestaurantEntity;
import com.repository.RestroRepository;



@Controller
public class RestaurantController {
	
	@Autowired
	RestroRepository restrorepo;
	
	@GetMapping("/newrestaurant")
	public String newrestro() {
		
		return "NewResturant";
	}
	
	@PostMapping("/saverestro")
	public String saverestro(RestaurantEntity restroentity) {
		restrorepo.save(restroentity);
		return "Success";
	}
	
	
	
	
	
}
