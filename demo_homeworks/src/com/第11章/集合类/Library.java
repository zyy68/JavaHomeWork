package com.第11章.集合类;
//由于书本不需要排序，但是有唯一的ISBN编号，所以用Map类型的集合来存储图书对象
//p221
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Library {
	Map<String, Book> books;
	
	public Library() {
		// TODO Auto-generated constructor stub
		books=new HashMap<String,Book>();
	}
	
	public boolean addBook(Book bookIn) {
		// TODO Auto-generated method stub
		//获取书本的ISBN编号
		String keyIn = bookIn.getISBN();
//		判断是否已经存在该键
		if(books.containsKey(keyIn))
//			有了则返回false表示无法再添加同一本书
			return false;
		else {
			//没有则添加到集合中
			books.put(keyIn, bookIn);
			return true;
		}
	}
	
	public boolean removeBook(String isbnIn) {
//		如果有key对应的元素删除元素并将这个元素返回，如果没有key对应的值就为null
		if(books.remove(isbnIn) != null){
//			当删除一个集合中的元素时，返回true
			return true;
		}else {
			return false;
		} 

	}
	
	 void getTotalNumberOfBooks() {
		// TODO Auto-generated method stub

	}
	
	public Map<String, Book> getBooks() {
		return books;
	}
//	
//	private Set<Book> getAllBooks() {
//		// TODO Auto-generated method stub
//
//	}
	
}
