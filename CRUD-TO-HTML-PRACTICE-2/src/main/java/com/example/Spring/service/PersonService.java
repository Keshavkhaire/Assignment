package com.example.Spring.service;

import java.util.List;

import com.example.Spring.entity.Person;



public interface PersonService 
{
	public void storedata(Person person);
	public List<Person> fetchdata();
	public void delete(int id);
	public void updatedata(Person person);

}
