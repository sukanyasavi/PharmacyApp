package com.github.service;

import java.util.List;

import com.github.model.ProductOrders;

public interface ProductOrdersService {

	List<ProductOrders> fetchProductOrders();

	ProductOrders saveProductOrders(ProductOrders productorders);

	void deleteProductOrders(long orderLine);

	void updateProductOrders(ProductOrders productOrders);

}
