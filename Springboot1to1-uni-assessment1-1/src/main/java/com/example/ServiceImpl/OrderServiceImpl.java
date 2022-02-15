package com.example.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Entity.Order;
import com.example.Repository.OrderRepository;
import com.example.Service.OrderService;

public class OrderServiceImpl implements OrderService
{
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order saveOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	}

	@Override
	public List<Order> listOrder() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	@Override
	public Order updateOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
