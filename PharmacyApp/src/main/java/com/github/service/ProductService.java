package com.github.service;

import java.util.List;

import com.github.model.Product;

public interface ProductService {

	List<Product> getallproducts();

	Product saveProduct(Product product);

	void updateproduct(Product product);

	void deleteProduct(long productId);

}
