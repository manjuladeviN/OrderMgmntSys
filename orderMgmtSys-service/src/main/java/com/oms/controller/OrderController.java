package com.oms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oms.model.Order;
import com.oms.service.OrderService;

@RestController
public class OrderController {
	
	
	  @Autowired 
	  private OrderService orderService;
	 
	 @GetMapping("/getOrder") public List<Order> retrieveOrder() { 
		 return  orderService.getAllOrders();	  
	  }
	  
	 @PostMapping("/createOrder") public Order createOrder(@RequestBody Order order) { 
		 orderService.saveOrder(order); 
		 return order; 
	 }
	 
}
