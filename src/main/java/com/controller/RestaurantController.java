package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.RestaurantEntity;
import com.repository.RestroRepository;
import org.springframework.web.bind.annotation.RequestParam;




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
	
	
	@GetMapping("/listrestro")
	public String listrestro(Model model) {
		List<RestaurantEntity> restro = restrorepo.findAll();
		model.addAttribute("restro",restro);
		
		return "ListRestaurant";
	}
	
	@GetMapping("/deleterestro")
	public String deleterestro(@RequestParam int rid) 
	{
		
		System.out.println(rid);
		restrorepo.deleteById(rid);
		
		return "redirect:/listrestro";
	}
	
	
	
}
