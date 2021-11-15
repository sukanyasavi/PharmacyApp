package com.github.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.model.Product;
import com.github.repository.ProductRepository;
import com.github.service.ProductService;
@Service
@Transactional
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productrepo;
	@Override
	public List<Product> getallproducts() {
		return productrepo.findAll();
		}

	@Override
	public Product saveProduct(Product product) {
		
		return productrepo.save(product);
	}

	@Override
	public void updateproduct(Product product) {
		productrepo.save(product)	;	
	}

	@Override
	public void deleteProduct(long productId) {
		productrepo.delete(productId);
		
	}

}
