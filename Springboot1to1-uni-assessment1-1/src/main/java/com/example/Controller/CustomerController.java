package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Customer;
import com.example.Service.CustomerService;



@RestController
public class CustomerController 
{
	
		
		
		 @Autowired(required = true)
		    private CustomerService customerServiceImpl;

		    @GetMapping("/")
		    public List<Customer> findAllCustomer(){
		        return customerServiceImpl.listCustomer();
		    }

		    @PostMapping("/")
		    public Customer storeCustomer(@RequestBody Customer customer) {
		        return customerServiceImpl.saveCustomer(customer);
		    }

}
