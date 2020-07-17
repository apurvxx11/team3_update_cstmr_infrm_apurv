package com.cg.bookStore.dao;

import org.springframework.stereotype.Repository;
import com.cg.bookStore.entities.BookInformation;
import java.util.List;

@Repository
public interface BookDAOI 
{
	public void addBooks(BookInformation b);
	public BookInformation getBookById(int id);
	public BookInformation getBooksById(List<Integer> ids);
}
