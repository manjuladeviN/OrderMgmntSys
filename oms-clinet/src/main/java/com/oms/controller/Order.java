package com.oms.controller;

import java.util.List;

public class Order {
	
	
	private Long id;
	
	private String customerName;
	
	private String orderDate;
	
	private String shippingAddr;
	
	private List<OrderItem> orderItems;
	
	private Integer total;
	public Order() {
		
	}
	
	public Order(String cstmrNm,String ordate,String shippingAddr,int total) {
		this.customerName = cstmrNm;
		this.orderDate =ordate;
		this.shippingAddr = shippingAddr;
		this.total=total;
	}	
	
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	
	
	
}
