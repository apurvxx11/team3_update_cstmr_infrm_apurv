package com.cg.bookStore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CascadeType;


@Entity
@Table(name="bk_order_inf")

public class OrderInformation 
{	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@ManyToOne
	private BookInformation book;

	public OrderInformation(BookInformation book) 
	{
		super();
		this.book = book;
	}

	public Long getId() 
	{
		return id;
	}

	public void setId(Long id) 
	{
		this.id = id;
	}

	public BookInformation getBook() 
	{
		return book;
	}

	public void setBook(BookInformation book) 
	{
		this.book = book;
	}
}
