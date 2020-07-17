package com.cg.bookStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.bookStore.dao.OrderDAOI;
import com.cg.bookStore.entities.Order;

@Service
public class UpdateCustomerDetailsService implements UpdateCustomerDetailsServiceI 
{
	
	@Autowired
	OrderDAOI orderDAO;
	
	@Override
	public Order findOrderById(int id) 
	{
		return orderDAO.getOrderById(id);
	}

	@Override
	public void updateOrderDetails(Order o) {
		
		orderDAO.updateOrder(o);
	}	
	
}
