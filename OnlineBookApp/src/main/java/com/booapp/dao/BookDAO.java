package com.booapp.dao;

import java.util.List;

import com.bookapp.exception.IDNotfoundException;
import com.bookapp.exceptions.AuthorNotFoundException;
import com.bookapp.exceptions.CategoryNotFoundException;
import com.bookapp.model.Book;

public interface BookDAO {
	void addOneBook(Book book);
	int updateOneBook(int bookid,double price) ;
	int deleteOnebook(int bookid);
	List<Book> findAllBooks();
	List<Book> findBookByAuthor(String author) ;
	List<Book> findBookBycategory(String category)  ;
	Book findBookById(int bookid) ;
	


}
