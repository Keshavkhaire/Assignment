package com.example.Control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Serviceimpl.Examservieimpl;
import com.example.entity.Exam;

@Controller
public class WebControler {

	@Autowired
	Examservieimpl impl;
	@GetMapping("/showme")
	public String shoe(Model model)
	{
		List<Exam> exam=impl.fetchdata();
		model.addAttribute("xam", exam);
		return "display";
	}
	
	
	
	@GetMapping("/showformme")
	public String shoew(Model model)
	{
		Exam e=new Exam();
		model.addAttribute("Exa", e);
		return "from";
	}
	
	@PostMapping("/submitform")
	public String storemy(Model model, @ModelAttribute("Exa") Exam exam)
	{
		
		impl.storedata(exam);
		return "redirect:/showformme";
	}
}
