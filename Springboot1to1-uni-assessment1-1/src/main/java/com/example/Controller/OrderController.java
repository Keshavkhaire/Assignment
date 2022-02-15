package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Order;
import com.example.Service.OrderService;





@RestController
public class OrderController 
{
	
	
	 @Autowired(required = true)
	    private OrderService orderServiceImpl;

	    @GetMapping("/")
	    public List<Order> findAllOrder(){
	        return orderServiceImpl.listOrder();
	    }

	    @PostMapping("/")
	    public Order storeOrder(@RequestBody Order order) {
	        return orderServiceImpl.saveOrder(order);
	    }

}
