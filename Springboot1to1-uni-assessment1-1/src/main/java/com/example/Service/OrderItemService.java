package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Entity.OrderItem;


@Service
public interface OrderItemService 
{
	    public OrderItem saveOrderItem(OrderItem orderitem);
	    public List<OrderItem> listOrderItem();
	    public OrderItem updateOrderItem(OrderItem orderitem);
	    public String deleteOrderItem(OrderItem orderitem);


}
