package com.cg.bookStore.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class BookDAOTest {
	
	
	@Autowired
	BookDAOI bookDAO;

	@Test
	void returnNULLTest() {
		assertThat(bookDAO.getBookById(1),is(empty()));
	}
	
	

}
