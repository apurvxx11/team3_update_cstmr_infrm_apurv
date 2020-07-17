package com.cg.bookStore.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.bookStore.entities.CustomerInformation;


@Transactional
@Repository

public class CustomerDAO implements CustomerDAOI 
{

	@PersistenceContext
	EntityManager em;
		
	@Override
	public void addCustomer(CustomerInformation c) 
	{
		em.persist(c); 
	}
}