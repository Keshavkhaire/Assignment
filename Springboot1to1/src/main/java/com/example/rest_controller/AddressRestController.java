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

import com.example.Spring.demo.Address;
import com.example.repository.AddressRepository;

@RestController
@RequestMapping("/address")
public class AddressRestController 
{
	 @Autowired
	    private AddressRepository addressRepository;

	    @GetMapping("/all")   // http://localhost:8080/address/all
	    public List<Address> getAllUser() 
	    {
	        return addressRepository.findAll();
	    }

	    @PostMapping("/save") // http://localhost:8080/address/save
	    public Address saveUser(@RequestBody Address details) 
	    {
	        return addressRepository.save(details);
	    }

	    @PutMapping("/update") // http://localhost:8080/address/update
	    public Address updateUser(@RequestBody Address details)
	    {
	        return addressRepository.save(details);
	    }

	    @DeleteMapping("/delete") // http://localhost:8080/address/update
	    public String deleteUser(@RequestBody Address details) 
	    {
	        addressRepository.delete(details);
	        return "Deleted Successfully"+details;
	    }

}
