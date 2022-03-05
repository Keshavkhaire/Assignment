package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.global.GlobalData;
import com.example.demo.serviceImpl.CategoryServiceImpl;
import com.example.demo.serviceImpl.ProductServiceImpl;

@Controller
public class Homecontroller 
{
  @Autowired
  CategoryServiceImpl categoryServiceImpl;  //busisnees logic 
  @Autowired
  ProductServiceImpl productServiceImpl;  //busisnees logic 
  @GetMapping("/home")    //customer home page
  public String Homepage(Model model,@PathVariable int id)
  {
	  
	  model.addAttribute("cartCount",GlobalData.cart.size());
	return "index";  
  }
  @GetMapping("/shop")   //to view product for shopping
  public String shopview(Model model)
  {
	 model.addAttribute("categories",categoryServiceImpl.getAllcategory());
	 model.addAttribute("products",productServiceImpl.getAllProducts());
	 model.addAttribute("cartCount",GlobalData.cart.size());
	 return "shop";
  }
  @GetMapping("/shop/category/{id}")   //to get product by category
  public String shopbyCategory(Model model,@PathVariable int id)
  {
	 model.addAttribute("categories",categoryServiceImpl.getAllcategory());
	 model.addAttribute("cartCount",GlobalData.cart.size());
	 model.addAttribute("products",productServiceImpl.viewProductbyCategory(id));
	 return "shop";
  }
  @GetMapping("/shop/viewproduct/{id}")    //for view the product in details
  public String viewproduct(Model model,@PathVariable int id)
  {
	
	 model.addAttribute("product",productServiceImpl.getproductById(id).get());
	 return "viewProduct";
  }
 

}
