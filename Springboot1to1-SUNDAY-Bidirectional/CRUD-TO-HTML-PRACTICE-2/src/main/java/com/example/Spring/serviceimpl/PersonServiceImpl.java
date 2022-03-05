package com.example.Spring.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Spring.Repository.PersonRepository;
import com.example.Spring.entity.Person;
import com.example.Spring.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService
{
	@Autowired
	private PersonRepository personRepository;

	@Override
	public void storedata(Person person) {
		// TODO Auto-generated method stub
		personRepository.save(person);
	}

	@Override
	public List<Person> fetchdata() {
		// TODO Auto-generated method stub
		return personRepository.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		personRepository.deleteById(id);
	}

	@Override
	public void updatedata(Person person) {
		// TODO Auto-generated method stub
		personRepository.save(person);
	}
	

}
