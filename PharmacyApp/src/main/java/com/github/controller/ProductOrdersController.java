package com.github.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.model.Order;
import com.github.model.ProductOrders;
import com.github.service.OrderService;
import com.github.service.ProductOrdersService;
@Controller
public class ProductOrdersController {

	@Autowired
	ProductOrdersService productOrdersService;



	@GetMapping( "/ProductOrdersList")
	@ResponseBody
	public List<ProductOrders> fetchProductOrders() {
		return productOrdersService.fetchProductOrders();
	}
	@PostMapping("/saveProductOrders")
	@ResponseBody
	public ProductOrders saveProductOrders(@RequestBody ProductOrders productorders) {
		return productOrdersService.saveProductOrders(productorders);
	}
	@PutMapping("/updateProductOrders")
	@ResponseBody
	public ProductOrders updateProductOrders(@RequestBody ProductOrders productOrders) {
		productOrdersService.updateProductOrders( productOrders);
		 return productOrders;
	}
		
	@DeleteMapping("/deleteproductorders/{orderLine}")
	@ResponseBody
	public void  deleteProductOrders(@PathVariable("orderLine") long orderLine) {
		productOrdersService.deleteProductOrders(orderLine);
	
	}
}
