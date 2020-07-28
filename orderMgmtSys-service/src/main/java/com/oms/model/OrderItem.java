package com.oms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="OrderItem")
public class OrderItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productCode;
	private String productName;
	private Integer quantity;
	
	 @ManyToOne
	 @JoinColumn(name="order_id")
	 private Order order;
	
	public OrderItem(String productNm, int qty,Order order) {
		this.productName = productNm;
		this.quantity = qty;
		this.order=order;
	}
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
}
