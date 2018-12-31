package com.第11章.集合类;

public class Book {

//	ISBN的编号
	private String isbn;
	private String author;
	private String title;
	
	public Book(String isbn,String author,String title) {
		this.isbn = isbn;
		this.author = author;
		this.title = title;
	}
	
	public String getISBN() {
		return isbn;
	}
	public String getAuthor() {
		return author;
	}
	public String getTitle() {
		return title;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+isbn+","+author+","+title+")\n";
	}
}
