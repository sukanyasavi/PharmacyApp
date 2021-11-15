package com.github.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTS")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PRODUCT_ID")
	private long productId;
	
	@Column(name="SUB_CATEGORY_ID")
	private long subCategoryId;
	
	@Column(name="PRODUCTCODE")
	private String productCode;
	
	@Column(name="PRODUCTDESCRIPTION")
	private String productDescription;
	
	@Column(name="PRICE")
	private int price;
	
	@Column(name="QUANTITY")
	private int quantity;

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(long subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(long productId, long subCategoryId, String productCode, String productDescription, int price,
			int quantity) {
		super();
		this.productId = productId;
		this.subCategoryId = subCategoryId;
		this.productCode = productCode;
		this.productDescription = productDescription;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", subCategoryId=" + subCategoryId + ", productCode=" + productCode
				+ ", productDescription=" + productDescription + ", price=" + price + ", quantity=" + quantity + "]";
	}
	


	
	
}