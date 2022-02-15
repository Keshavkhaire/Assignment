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

import com.example.Service.EmployeeService;
import com.example.entity.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController
{
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public List<Employee> findEmp()
	{
		return employeeService.listEmployee();
	}
	
	@PostMapping("/")
	public Employee storeEmployee(@RequestBody Employee employee)
	{
		return employeeService.saveEmployee(employee);
	}
	
	@PutMapping("/")
	public Employee updateService(@RequestBody Employee employee)
	{
		return employeeService.saveEmployee(employee);
	}
	
	@DeleteMapping("/")
	public String deleteService(@RequestBody Employee employee)
	{
		 employeeService.deleteEmployee(employee);
		 return "delete done";
		
	}
	
	
	

}
