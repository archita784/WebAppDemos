package com.booapp.main;


import com.bookapp.exception.IDNotfoundException;
import com.bookapp.exceptions.AuthorNotFoundException;
import com.bookapp.exceptions.CategoryNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		BookService service= new BookServiceImpl();
		service.getAllBooks().forEach(System.out::println);
		System.out.println("by author");
		try {
			service.getBookByAuthor("Monk").forEach(System.out::println);
		} catch (AuthorNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			service.getBookBycategory("tech").forEach(System.out::println);
			
		}catch(CategoryNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		  try { 
			  Book book=service.getBookById(9);
				System.out.println(book);
		  
		  }catch(IDNotfoundException e) { System.out.println(e.getMessage()); }
		 

	}

}
