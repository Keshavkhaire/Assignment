package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Repository.LaptopRepository;
import com.example.Service.LaptopService;
import com.example.entity.Laptop;

public class LaptopServiceimpl implements LaptopService
{
	 @Autowired
	    private LaptopRepository laptopRepository;

	@Override
	public Laptop saveLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		return laptopRepository.save(laptop);
	}

	@Override
	public List<Laptop> listLaptop() {
		// TODO Auto-generated method stub
		return laptopRepository.findAll();
	}

	@Override
	public Laptop updateLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		return laptopRepository.save(laptop);
	}

	@Override
	public String deleteLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		laptopRepository.delete(laptop);
		return "delete done";
	}
	

}
