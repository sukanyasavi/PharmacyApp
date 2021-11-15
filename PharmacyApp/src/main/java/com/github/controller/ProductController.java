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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.model.Product;
import com.github.service.ProductService;

@Controller
@RequestMapping("/")
public class ProductController {

	@Autowired
	ProductService productService;

 
		@GetMapping( "/fetchproductList")
	@ResponseBody
	public List<Product> getallproducts() {
		return productService.getallproducts();
	}
	
	@PostMapping("/saveproduct")
	@ResponseBody
	public Product saveCategory(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	@PutMapping("/updateproductList")
	@ResponseBody
	public Product updateproduct(@RequestBody Product product) {
		productService.updateproduct( product);
		 return product;
	}
	
	@DeleteMapping("/deletepProduct/{productId}")
	@ResponseBody
	public void  deleteProduct(@PathVariable("productId") long productId) {
		productService.deleteProduct(productId);
	
	}
}
