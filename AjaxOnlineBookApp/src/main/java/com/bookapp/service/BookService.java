package com.bookapp.service;

import java.util.List;

import com.bookapp.exception.IDNotfoundException;
import com.bookapp.exceptions.AuthorNotFoundException;
import com.bookapp.exceptions.CategoryNotFoundException;
import com.bookapp.model.Book;

public interface BookService {
	void addBook(Book book);
	void updateBook(int bookid,double price) throws IDNotfoundException;
	void deletebook(int bookid);
	List<Book> getAllBooks();
	List<Book>getBookByAuthor(String author) throws AuthorNotFoundException;
	List<Book> getBookBycategory(String category) throws CategoryNotFoundException;
	Book getBookById(int bookid) throws IDNotfoundException;
	
}
