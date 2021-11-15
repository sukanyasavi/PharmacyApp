package com.github.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTORDERS")
public class ProductOrders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ORDER_LINE")
	private long orderLine;

	@Column(name = "PRODUCT_ID")
	private int productId;

	@Column(name = "QUANTITY")
	private int quantity;

	public ProductOrders() {
		super();
	}

	public long getOrderLine() {
		return orderLine;
	}

	public void setOrderLine(long orderLine) {
		this.orderLine = orderLine;
	}


	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public ProductOrders(long orderLine, int productId, int quantity) {
		super();
		this.orderLine = orderLine;
		this.productId = productId;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ProductOrders [orderLine=" + orderLine + ", productId=" + productId + ", quantity=" + quantity + "]";
	}
}