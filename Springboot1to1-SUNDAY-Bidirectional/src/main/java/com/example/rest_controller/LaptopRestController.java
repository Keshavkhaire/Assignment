package com.example.rest_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.LaptopService;
import com.example.entity.Laptop;



@RestController
@RequestMapping("/laptop")
public class LaptopRestController 
{
	@Autowired
	private LaptopService laptopService;
	
	@GetMapping("/")
	public List<Laptop> findEmp()
	{
		return laptopService.listLaptop();
	}
	
	@PostMapping("/")
	public Laptop storeEmployee(@RequestBody Laptop laptop)
	{
		return laptopService.saveLaptop(laptop);
	}
	
	@PutMapping("/")
	public Laptop updateService(@RequestBody Laptop laptop)
	{
		return laptopService.saveLaptop(laptop);
	}
	
	@DeleteMapping("/")
	public String deleteService(@RequestBody Laptop laptop)
	{
		laptopService.deleteLaptop(laptop);
		return "delete done";
	}
	

}
