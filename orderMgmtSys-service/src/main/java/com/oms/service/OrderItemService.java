package com.oms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oms.model.Order;
import com.oms.model.OrderItem;
import com.oms.repository.OrderItemRepository;

@Service
public class OrderItemService {
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	

	public void saveOrderItem(OrderItem orderItem) {
		orderItemRepository.save(orderItem);
	}
	
	 public List<OrderItem> getAllOrderItems() { 
		 List<OrderItem> orderItems = (List<OrderItem>) orderItemRepository.findAll();
		return orderItems; 
	 }
}
