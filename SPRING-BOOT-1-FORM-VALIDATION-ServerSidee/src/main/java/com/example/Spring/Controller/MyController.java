package com.example.Spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.Spring.entity.LoginData;

@Controller
public class MyController 
{
	@GetMapping("/form")
	public String openform(Model model)
	{
		System.out.println("opening form");
		model.addAttribute("loginData", new LoginData());
		return "form";
	}
	
	//handler for process form
	
//	@PostMapping("/process")
//	public String processForm(@ModelAttribute("loginData") LoginData loginData)
//	{
//		System.out.println(loginData);
//		return "success";
//	}
	
	@GetMapping("/getform")
	public ModelAndView getform(Model model, LoginData data)
	{
		ModelAndView mv= new ModelAndView();
		mv.addObject("Login",data);
		mv.setViewName("success");
		return mv;
		
	}
	

}
