package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Entity.Order;


@Service
public interface OrderService 
{
	    public Order saveOrder(Order order);
	    public List<Order> listOrder();
	    public Order updateOrder(Order order);
	    public String deleteOrder(Order order);



}
