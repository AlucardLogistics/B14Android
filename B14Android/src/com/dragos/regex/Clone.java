package com.dragos.regex;

public class Clone implements Cloneable {
	
	int rollno;
	String name;
	
	public Clone(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	} //test
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {
		
		try {
			Clone c1 = new Clone(88, "Android 18");
			
			Clone c2 = (Clone) c1.clone();
			Clone c3 = c1;
			
			System.out.println(c1.rollno + " " + c1.name);
			System.out.println(c2.rollno + " " + c2.name);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
