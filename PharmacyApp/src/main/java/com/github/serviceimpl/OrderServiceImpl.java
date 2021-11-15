package com.github.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.model.Order;
import com.github.repository.OrderRepository;
import com.github.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService{
@Autowired
OrderRepository orderRepository;
	@Override
	
	public List<Order> fetchOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}
	@Override
	public Order saveOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	}
	@Override
	public void deleteOrder(long orderId) {
		// TODO Auto-generated method stub
		orderRepository.delete(orderId);
	}
	@Override
	public void updateorder(Order order) {
		// TODO Auto-generated method stub
		orderRepository.save(order);
	}

}
