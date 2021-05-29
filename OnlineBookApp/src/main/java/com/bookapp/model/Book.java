package com.bookapp.model;

public class Book {
	private String title;
	private Integer bookid ; 
	private String author;
	private String category;
	private double price;
	public Book() {
		super();
	}
	public Book(String title, Integer bookid, String author, String category, double price) {
		super();
		this.title = title;
		this.bookid = bookid;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
		
	@Override
	public String toString() {
		return "Book [title=" + title + ", bookid=" + bookid + ", author=" + author + ", category=" + category
				+ ", price=" + price + "]";
	}

}
