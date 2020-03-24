package com.mb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mb.model.Book;
import com.mb.model.BookCategory;
import com.mb.repository.BookCategoryRepository;
import com.mb.repository.BookRepository;

@SpringBootApplication
public class BookStoreApplication  {

	/*
	 * @Autowired BookRepository bookRepository;
	 * 
	 * @Autowired
	 * 
	 * BookCategoryRepository bookCategoryRepository;
	 */
	

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * //System.out.println(bookRepository.findAll());
	 * 
	 * for (Book book : bookRepository.findAll()) {
	 * System.out.println(book.toString()); } for (BookCategory bookc :
	 * bookCategoryRepository.findAll()) { System.out.println(bookc.toString()); }
	 * 
	 * }
	 */

}
