package com.ibm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ibm.Entity.BookEntity;
import com.ibm.Entity.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cntx=
				SpringApplication.run(Application.class, args);
		
		BookRepository bean = cntx.getBean(BookRepository.class);
		
		BookEntity book=new BookEntity();
		book.setBookid(101);
		book.setBookname("java");
		book.setBookprice(2000.00);
		bean.save(book);
		System.out.println("Data Inserted");
		
	}

}
