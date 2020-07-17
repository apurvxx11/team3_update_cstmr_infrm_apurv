package com.cg.bookStore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.cg.bookStore.entities.BookInformation;


@Transactional
@Repository

public class BookDAO implements BookDAOI {
	
	
	@PersistenceContext
	EntityManager em;

	@Override
	public BookInformation getBookById(int id) 
	{
		return em.find(BookInformation.class, id);
	}

	@Override
	public BookInformation getBooksById(List<Integer> ids) 
	{
		return null;
	}

	@Override
	public void addBooks(BookInformation b) {
		
		em.persist(b);
		
	}

}
