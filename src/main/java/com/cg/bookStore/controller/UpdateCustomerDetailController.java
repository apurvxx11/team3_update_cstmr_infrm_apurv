package com.cg.bookStore.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookStore.dao.OrderDAOI;
import com.cg.bookStore.entities.Order;
import com.cg.bookStore.service.UpdateCustomerDetailsService;

@RestController

public class UpdateCustomerDetailController 
{
	@Autowired
	OrderDAOI orderDAO;
	
	@Autowired
	UpdateCustomerDetailsService update;
	
	@PutMapping("/updateOrder/{id}")
	public void updateOrder(@PathVariable(value = "id") int orderid,@Valid @RequestBody Order orderDetails) 
	{	
		Order curr = orderDAO.getOrderById(orderid);
		update.updateOrderDetails(curr);						
	}
}
