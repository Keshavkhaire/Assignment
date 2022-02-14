package com.example.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllerrr 
{
	@RequestMapping("/show")
	public String hello()
	{
		System.out.println("good afternoon all of you");
		return "NewFile1";
	}

}
