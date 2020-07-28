package com.oms.controller;

public class OrderItem {
	

	private Integer productCode;
	private String productName;
	private Integer quantity;
	

	 private Order order;
	
	public OrderItem(String productNm, int qty,Order order) {
		this.productName = productNm;
		this.quantity = qty;
		this.order=order;
	}
	public Order getOrder() {
		return order;
	}

	public Integer getProductCode() {
		return productCode;
	}
	public void setProductCode(Integer productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
}
