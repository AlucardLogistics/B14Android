package com.dragos.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Book {
	
	int id;
	String name, author, publisher;
	int quantity;
	
	
	
	public Book(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity="
				+ quantity + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> list = new ArrayList<Book>();
		List<Book> linkedList = new LinkedList<Book>();
		Book book1 = new Book(101, "title1", "author1", "publisher1", 5);
		Book book2 = new Book(102, "title2", "author2", "publisher2", 2);
		Book book3 = new Book(103, "title3", "author3", "publisher3", 8);
		
		list.add(book1);
		list.add(book2);
		list.add(book3);
		
		linkedList.add(book1);
		linkedList.add(book2);
		linkedList.add(book3);
		
		//**************************ARAYLIST
		
//		for(Book b : list) {
//			System.out.println(b);
//		}
		
//		Iterator iterator = list.iterator();
//		while(iterator.hasNext()) {
//			Book b = (Book) iterator.next();
//			System.out.println(b);
//		}
		
		//****************************LINKEDLIST
		for(Book b : linkedList) {	
			System.out.println(b);
		}

	}


}
