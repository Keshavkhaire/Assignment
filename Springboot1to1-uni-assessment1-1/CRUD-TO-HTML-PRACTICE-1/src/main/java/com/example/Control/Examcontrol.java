package com.example.Control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Serviceimpl.Examservieimpl;
import com.example.entity.Exam;

@RestController
public class Examcontrol {

	@Autowired
	private Examservieimpl impl;
	
	@PostMapping("/admydata")
	public void ptda(@RequestBody Exam exam)
	{
		impl.storedata(exam);
		
	}
	
	@GetMapping("/showmydata")
	public List<Exam> shodat()
	{
		return impl.fetchdata();
	}
	
	@PostMapping("/updatedata")
	public void updata(@RequestBody Exam exam)
	{
		impl.updatedata(exam);
	}
	@DeleteMapping("/delete{id}")
	public void deleteme(@PathVariable int id)
	{
		try {
			
	
		impl.delete(id);
		System.out.println("done");
		}
		catch(Exception e)
		{
			System.out.println("faild");
		}
	}
	
}
