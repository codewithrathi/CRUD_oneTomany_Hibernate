package com.crudAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.crudAPI.entity.Order;
import com.crudAPI.service.OrderService;

public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/orders")
	public List<Order> getAllOrders(){
		return orderService.getAllOrders();
	}
	
	@GetMapping("/orders/{id}")
	public Order getById(@PathVariable Long id) {
		return orderService.getById(id);
	}
	
	@PostMapping("/orders")
	public void addOrder(@RequestBody Order order) {
		orderService.addOrder(order);
	}
	
	@DeleteMapping("/orders/{id}")
	public void deleteOrder(@PathVariable Long id) {
		orderService.deleteOrder(id);
	}

}
