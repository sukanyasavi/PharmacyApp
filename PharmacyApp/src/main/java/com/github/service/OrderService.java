package com.github.service;

import java.util.List;

import com.github.model.Order;

public interface OrderService {

	List<Order> fetchOrders();

	Order saveOrder(Order order);

	void deleteOrder(long orderId);

	void updateorder(Order order);

}
