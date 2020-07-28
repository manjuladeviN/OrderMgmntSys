package com.oms.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestClientException;

import com.oms.service.RemoteCallService;

@Controller
public class OmsControllerClient {
	@Autowired
	private RemoteCallService loadBalancer;
	
	public void getOrderItems() throws RestClientException, IOException {
		System.out.println("getOrderItems called in feign client");
		try {
			List<OrderItem> orderItems = loadBalancer.getOrderItem();
			if(orderItems.size() !=0) {
				for(OrderItem item: orderItems) {
					System.out.println(item);
				}
				
			}
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
		
	}
	
	public void cretaeOrderItems() {
		System.out.println("create OrderItems called in Feign Client");
		loadBalancer.createOrderItem();
	}
	
	
	public void getOrders() throws RestClientException, IOException {
		System.out.println("getOrder is called in feign client");
		try {
			List<Order> orders = loadBalancer.getOrders();
			if(orders.size() !=0) {
				for(Order order: orders) {
					System.out.println(order);
				}
				
			}
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
		
	}
	
	public void cretaeOrders() {
		System.out.println("create Order is called in Feign Client");
		loadBalancer.createOrder();
	}
}
