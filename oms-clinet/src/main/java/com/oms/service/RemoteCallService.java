package com.oms.service;

import java.util.*;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oms.controller.Order;
import com.oms.controller.OrderItem;

@FeignClient(name="oms-service")
public interface RemoteCallService {
	@RequestMapping(method=RequestMethod.GET, value="/getOrderItem")
	public List<OrderItem> getOrderItem();
	
	@RequestMapping(method=RequestMethod.POST,value="/createOrderItem")
	public  OrderItem createOrderItem();
	
	
	@RequestMapping(method=RequestMethod.GET, value="/getOrder")
	public List<Order> getOrders();
	
	@RequestMapping(method=RequestMethod.POST,value ="/createOrder")
	public Order createOrder();
}
