package com.oms.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Order_table")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String customerName;
	
	private String orderDate;
	
	private String shippingAddr;
	
	@OneToMany(mappedBy = "order",
			cascade = CascadeType.ALL,
			orphanRemoval = true
	)
	private List<OrderItem> orderItems = new ArrayList<>();
	
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
