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

import com.github.model.Order;
import com.github.model.Product;
import com.github.model.User;
import com.github.service.OrderService;
import com.github.service.UserService;
@Controller
public class OrderController {
	
	

		@Autowired
		OrderService orderService;


	
		@GetMapping( "/fetchOrderList")
		@ResponseBody
		public List<Order> fetchOrders() {
			return orderService.fetchOrders();
		}
		@PostMapping("/saveOrder")
		@ResponseBody
		public Order saveOrder(@RequestBody Order order) {
			return orderService.saveOrder(order);
		}
		@PutMapping("/updateorder")
		@ResponseBody
		public Order updateorder(@RequestBody Order order) {
			orderService.updateorder( order);
			 return order;
		}
			
		@DeleteMapping("/deleteorder/{orderId}")
		@ResponseBody
		public void  deleteOrder(@PathVariable("orderId") long orderId) {
			orderService.deleteOrder(orderId);
		
		}
}
