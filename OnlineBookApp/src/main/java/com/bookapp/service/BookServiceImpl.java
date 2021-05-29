package com.bookapp.service;

import java.util.List;
import java.util.stream.Collectors;

import com.booapp.dao.BookDAO;
import com.booapp.dao.BookDAOImpl;
import com.bookapp.exception.IDNotfoundException;
import com.bookapp.exceptions.AuthorNotFoundException;
import com.bookapp.exceptions.CategoryNotFoundException;
import com.bookapp.model.Book;

public class BookServiceImpl implements BookService {
	BookDAO bookDAO = new BookDAOImpl();

	public void addBook(Book book) {
		bookDAO.addOneBook(book);

	}

	public void deletebook(int bookid) {
		bookDAO.deleteOnebook(bookid);

	}

	public List<Book> getAllBooks() {
		return bookDAO.findAllBooks().stream().sorted((b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()))
				.collect(Collectors.toList());
	}

	public List<Book> getBookByAuthor(String author) throws AuthorNotFoundException {
		List<Book> bookList = bookDAO.findBookByAuthor(author);
		if (bookList.isEmpty())
			throw new AuthorNotFoundException("author not found");
		return bookList;
	}

	public List<Book> getBookBycategory(String category) throws CategoryNotFoundException {
		List<Book> bookList = bookDAO.findBookBycategory(category);

		if (bookList.isEmpty())
			throw new CategoryNotFoundException("category not found");
		return bookList;
	}

	public void updateBook(int bookid, double price) throws IDNotfoundException {
		bookDAO.updateOneBook(bookid, price);
	}

	public Book getBookById(int bookid) throws IDNotfoundException {
		Book book = bookDAO.findBookById(bookid);
		if (book == null)
			throw new IDNotfoundException("Invalid Id");
		return book;
	}

}
