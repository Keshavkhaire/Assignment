package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Laptop;

@Service
public interface LaptopService 
{
	   public Laptop saveLaptop(Laptop laptop);
	    public List<Laptop> listLaptop();
	    public Laptop updateLaptop(Laptop laptop);
	    public String deleteLaptop(Laptop laptop);

}
