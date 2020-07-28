package com.oms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oms.model.Order;
import com.oms.repository.OrderRepository;

@Service
public class OrderService {
	
	
	 @Autowired 
	 private OrderRepository omsRepository;
	  
	 public List<Order> getAllOrders() { 
		 List<Order> orders = (List<Order>) omsRepository.findAll();
		return orders; 
	 }
	  
	 public void saveOrder(Order order) { 
		 omsRepository.save(order); 
	}
	 
	

}
