package com.dragos.collections;

import java.util.*;

public class TestSortStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StudentComparable>  al = new ArrayList<StudentComparable>();
		ArrayList bl = new ArrayList();
		al.add(new StudentComparable(101, "Batman", 33));
		al.add(new StudentComparable(102, "Superman", 47));
		al.add(new StudentComparable(103, "Aquaman", 77));
		
		bl.add(new Book(101, "title1", "author1", "publisher1", 5));
		bl.add(new Book(102, "title2", "author1", "publisher1", 11));
		bl.add(new Book(103, "title3", "author1", "publisher1", 20));
		
		Collections.sort(bl, new BookComparator());
		Iterator it = bl.iterator();
		while(it.hasNext()) {
			Book b = (Book) it.next();
			System.out.println(b.toString());
		}
		
		Collections.sort(al);
		for(StudentComparable st :al) {
			System.out.println(st);
		}

	}

}
