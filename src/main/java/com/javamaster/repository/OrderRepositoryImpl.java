package com.javamaster.repository;

import java.util.ArrayList;
import java.util.List;

import com.javamaster.domain.Order;

public class OrderRepositoryImpl implements OrderRepository {
	
	private List<Order> orders = new ArrayList<Order>();
	
	public OrderRepositoryImpl() {
		Order order = new Order();
		order.setId(1);
		order.setPrice(234d);
		order.setTitle("Pizza peperoni");
		Order order2 = new Order();
		order2.setId(2);
		order2.setPrice(123d);
		order2.setTitle("Sushi Philadelfia");
		orders.add(order);
		orders.add(order2);
	}

	public void save(Order order) {
		orders.add(order);
	}

	public void delete(Order order) {
		orders.remove(order);
	}

	public List<Order> getAll() {
		return orders;
	}

	public Order getById(Integer id) {
		return orders.get(id);
	}
}
