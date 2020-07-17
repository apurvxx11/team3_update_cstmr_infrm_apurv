package com.cg.bookStore.dao;

import com.cg.bookStore.entities.Order;
import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public interface OrderDAOI 
{
	public Order getOrderById(int id);
	public List<Order> getAllOrders(); 
	public void addOrder(Order o);
	public void updateOrder(Order o);
}
