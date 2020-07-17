package com.cg.bookStore;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.bookStore.dao.BookDAOI;
import com.cg.bookStore.dao.CustomerDAOI;
import com.cg.bookStore.dao.OrderDAOI;
import com.cg.bookStore.entities.BookInformation;
import com.cg.bookStore.entities.CustomerInformation;
import com.cg.bookStore.entities.Order;
import com.cg.bookStore.entities.OrderInformation;

@SpringBootApplication
public class EvergreenBooksApurvTeamThreeApplication implements CommandLineRunner {
	
	@Autowired
	CustomerDAOI customer;
	
	@Autowired
	BookDAOI book;
	
	@Autowired
	OrderDAOI order;
	

	public static void main(String[] args) {
		SpringApplication.run(EvergreenBooksApurvTeamThreeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LocalDate curr = LocalDate.now();
		CustomerInformation c = new CustomerInformation("g@gmail.com","apurv","dddd","8876","LKO",224,"India",curr);
//		customer.addCustomer(c);
//		CustomerInformation(int customerId, @Size(min = 10, max = 64) String emailAddress,
//				@Size(min = 8, max = 30) String fullName, @Size(min = 8, max = 16) String password,
//				@Size(min = 10, max = 15) String phoneNumber, @Size(min = 3, max = 32) String city,
//				@Size(min = 3, max = 24) Integer zipCode, @Size(min = 3, max = 64) String country, LocalDate registerDate)
		
//		BookInformation(int bookId, @Size(min = 10, max = 128) String title, @Size(min = 5, max = 64) String author,
//				@Size(min = 200, max = 2000) String description, @Size(min = 10, max = 15) String isbnNumber,
//				LocalDate publishDate, LocalDate lastUpdateTime, Order order)
		
		BookInformation b = new BookInformation("magic","apurv","amazing","877",curr,curr);
		BookInformation cc = new BookInformation("magician","verma","amazing","877",curr,curr);
//		book.addBooks(cc);
//		book.addBooks(b); 

//		Order(CustomerInformation customerDetails, String shippingAddress, int quantity, float subTotal,
//				float total, String orderStatus, String paymentMethod, LocalDate orderDate,
//				List<OrderInformation> orderInformation)
		
//		OrderInformation(BookInformation book) 
//		{
//			this.book = book;
//		}
		
		List<OrderInformation> o_inf = new ArrayList();
		
		OrderInformation aaa = new OrderInformation(b);
		OrderInformation bbb = new OrderInformation(cc);
		
		o_inf.add(aaa);
		o_inf.add(bbb);
		
		
		Order o = new Order(c, "Aisbagh",12,45,22,"Placed","COD",curr,o_inf);
		order.addOrder(o);		
		
	}

}
