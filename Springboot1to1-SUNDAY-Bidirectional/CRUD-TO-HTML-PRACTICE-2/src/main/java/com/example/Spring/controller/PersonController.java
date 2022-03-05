package com.example.Spring.controller;

import java.util.List;

import org.hibernate.type.TrueFalseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring.entity.Person;
import com.example.Spring.serviceimpl.PersonServiceImpl;

@RestController
public class PersonController 
{
	@Autowired
	private PersonServiceImpl impl;

	
	@PostMapping("/addmydata")
	public void storedata(@RequestBody Person person)
	{
		impl.storedata(person);
	}
	
	@GetMapping("/showmydata")
	public List<Person> showdata()
	{
		return impl.fetchdata();
	}
	
	@PostMapping("/updatedata")
	public void updatae(@RequestBody Person person)
	{
		impl.updatedata(person);
	}
	
	@DeleteMapping("/delete{id}")
	public String delete(@PathVariable int id)
	{
		impl.delete(id);
		return "done";
	}

}
