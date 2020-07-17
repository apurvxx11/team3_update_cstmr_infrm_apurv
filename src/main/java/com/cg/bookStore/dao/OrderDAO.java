package com.cg.bookStore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.cg.bookStore.entities.Order;


@Repository
@Transactional
public class OrderDAO implements OrderDAOI 
{
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public Order getOrderById(int id) 
	{
		return em.find(Order.class,id);
	}

	@Override
	public List<Order> getAllOrders() 
	{
		Query q = em.createQuery("from Orders o");
		return q.getResultList();
	}

	@Override
	public void addOrder(Order o) 
	{
		em.persist(o);
	}

	@Override
	public void updateOrder(Order curr) {
		
		Order updated = em.find(Order.class, curr);
		updated.setOrderDate(curr.getOrderDate());
		updated.setShippingAddress(curr.getShippingAddress());
		updated.setOrderStatus(curr.getOrderStatus());
		updated.setOrderInformation(curr.getOrderInformation());
		
	}

}
