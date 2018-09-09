package com.dragos.collections;

public class StudentComparable implements Comparable<StudentComparable> {
	
	int rollno;
	String name;
	int age;
	
	public StudentComparable(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(StudentComparable st) {
		if(age == st.age)
			return 0;
		else if(age > st.age)
			return 1;
		else
			return -1;
	}

	@Override
	public String toString() {
		return "StudentComparable [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

	
	
	
}
