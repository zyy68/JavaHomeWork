package com.��11��.������;
//�����鱾����Ҫ���򣬵�����Ψһ��ISBN��ţ�������Map���͵ļ������洢ͼ�����
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
		//��ȡ�鱾��ISBN���
		String keyIn = bookIn.getISBN();
//		�ж��Ƿ��Ѿ����ڸü�
		if(books.containsKey(keyIn))
//			�����򷵻�false��ʾ�޷������ͬһ����
			return false;
		else {
			//û������ӵ�������
			books.put(keyIn, bookIn);
			return true;
		}
	}
	
	public boolean removeBook(String isbnIn) {
//		�����key��Ӧ��Ԫ��ɾ��Ԫ�ز������Ԫ�ط��أ����û��key��Ӧ��ֵ��Ϊnull
		if(books.remove(isbnIn) != null){
//			��ɾ��һ�������е�Ԫ��ʱ������true
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
