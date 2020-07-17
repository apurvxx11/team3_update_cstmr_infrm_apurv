package com.cg.bookStore.dao;

import org.springframework.stereotype.Repository;

import com.cg.bookStore.entities.CustomerInformation;

@Repository
public interface CustomerDAOI 
{	
	public void addCustomer(CustomerInformation cust);
}
