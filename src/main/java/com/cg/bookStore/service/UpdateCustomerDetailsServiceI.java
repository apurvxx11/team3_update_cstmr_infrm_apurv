package com.cg.bookStore.service;

import org.springframework.stereotype.Service;
import com.cg.bookStore.entities.Order;

@Service
public interface UpdateCustomerDetailsServiceI 
{
	public Order findOrderById(int id);
	public void updateOrderDetails(Order o);
}
