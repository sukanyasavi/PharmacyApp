package com.github.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.model.ProductOrders;
import com.github.repository.ProductOrdersRepository;
import com.github.service.ProductOrdersService;
@Service
public class ProductOrdersServiceImpl implements ProductOrdersService{
@Autowired
ProductOrdersRepository productOrdersRepository;

@Override
public List<ProductOrders> fetchProductOrders() {
	// TODO Auto-generated method stub
	return productOrdersRepository.findAll();
}

@Override
public ProductOrders saveProductOrders(ProductOrders productorders) {
	// TODO Auto-generated method stub
	return productOrdersRepository.save(productorders);
}

@Override
public void deleteProductOrders(long orderLine) {
	// TODO Auto-generated method stub
	productOrdersRepository.delete(orderLine);
}

@Override
public void updateProductOrders(ProductOrders productOrders) {
	// TODO Auto-generated method stub
	productOrdersRepository.save(productOrders);
}
}
