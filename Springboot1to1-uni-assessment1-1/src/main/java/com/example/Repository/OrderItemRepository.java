package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Jpa21Utils;
import org.springframework.stereotype.Repository;

import com.example.Entity.OrderItem;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>
{
	

}
