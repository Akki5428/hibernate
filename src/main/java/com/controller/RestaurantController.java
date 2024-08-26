package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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
	public String saverestro(@Validated RestaurantEntity restroentity,BindingResult result,Model model) {
		
		if(result.hasErrors()){
			System.out.println(result.getAllErrors());
			model.addAttribute("restro",restroentity);
			model.addAttribute("result",result);
			return "NewResturant";
		}
		else
		{
			restrorepo.save(restroentity);
			return "Success";
		}
		
		
		
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
	
	@GetMapping("/editrestro")
	public String editrestro(@RequestParam int rid,Model model) 
	{
		
		System.out.println(rid);
		Optional<RestaurantEntity> restro = restrorepo.findById(rid);
		
		if(restro.isEmpty())
		{
			return "Error";
		}
		
		else
		{
			model.addAttribute("restro",restro.get());
			return "EditResaurant";
		}
		
		
	}
	
	@PostMapping("/editedrestro")
	public String editedrestro(RestaurantEntity restroentity) {
		restrorepo.save(restroentity);
		return "redirect:/listrestro";
	}
	
	
	
	
	
}
