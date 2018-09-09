package com.dragos.collections;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
	
	@Override
	public int compare(Book b1, Book b2) {
		if(b1.quantity == b2.quantity)
			return 0;
		else if (b1.quantity > b2.quantity)
			return 1;
		else
			return -1;
	}

}
