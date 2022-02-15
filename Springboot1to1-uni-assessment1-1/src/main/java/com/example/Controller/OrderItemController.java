package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.OrderItem;
import com.example.Service.OrderItemService;
import com.example.ServiceImpl.OrderServiceImpl;



@RestController
public class OrderItemController 
{
	
	 @Autowired(required = true)
	    private OrderItemService orderitemServiceImpl;

	    @GetMapping("/")
	    public List<OrderItem> findAllOrderItem(){
	        return orderitemServiceImpl.listOrderItem();
	    }

	    @PostMapping("/")
	    public OrderItem storeOrderItem(@RequestBody OrderItem orderitem) {
	        return orderitemServiceImpl.saveOrderItem(orderitem);
	    }
	
	

}
