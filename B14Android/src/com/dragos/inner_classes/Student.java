package com.dragos.inner_classes;

public class Student extends Person {
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}
	
	void read() {
		class LocalClass {
			void askQuestions() {
				System.out.println("Asking questions all day!");
			}			
		}
		
		LocalClass lc = new LocalClass();
		lc.askQuestions();
	}

}
