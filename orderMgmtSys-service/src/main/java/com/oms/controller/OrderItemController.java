package com.oms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oms.model.Order;
import com.oms.model.OrderItem;
import com.oms.service.OrderItemService;
import com.oms.service.OrderService;

@RestController
public class OrderItemController {
	@Autowired 
	  private OrderItemService orderItemService;
	 
	 @GetMapping("/getOrderItem") public List<OrderItem> retrieveOrder() { 
		 return  orderItemService.getAllOrderItems();	  
	  }
	  
	 @PostMapping("/createOrderItem") public OrderItem createOrderItem(@RequestBody OrderItem orderItem) { 
		 orderItemService.saveOrderItem(orderItem); 
		 return orderItem; 
	 }
}
