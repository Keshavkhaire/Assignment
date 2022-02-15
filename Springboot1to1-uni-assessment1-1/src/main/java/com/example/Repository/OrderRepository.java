package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long>
{
	

}
