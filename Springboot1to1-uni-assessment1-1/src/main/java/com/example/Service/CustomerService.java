package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Entity.Customer;


@Service
public interface CustomerService
{
	    public Customer saveCustomer(Customer customer);
	    public List<Customer> listCustomer();
	    public Customer updateCustomer(Customer customer);
	    public String deleteCustomer(Customer customer);


}
