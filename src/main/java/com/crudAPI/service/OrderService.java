package com.crudAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudAPI.entity.Order;
import com.crudAPI.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> getAllOrders(){
		return orderRepository.findAll();
	}
	
	public Order getById(Long id) {
		return orderRepository.getReferenceById(id);
	}
	
	public void addOrder(Order order) {
		orderRepository.save(order);
	}
	
	public void deleteOrder(Long id) {
		orderRepository.deleteById(id);
	}
}
