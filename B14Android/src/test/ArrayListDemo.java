package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListDemo {
	
	

	public static void main(String[] args) {
		
		List<Student> studentsListOne = new ArrayList<Student>();
		studentsListOne.add(new Student(1, "dragos", "stoian"));
		studentsListOne.add(new Student(2, "andy", "andy"));
		studentsListOne.add(new Student(3, "jessie", "hero"));
		
//		Iterator<Student> iterator = studentsListOne.iterator();
//		while(iterator.hasNext()) {
//			Student student = iterator.next();
//			System.out.println("Student: " + student);
//		}
		
		for(Student student : studentsListOne) {
			System.out.println(student);
		}
		

	}

}
