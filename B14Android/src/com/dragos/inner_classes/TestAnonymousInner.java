package com.dragos.inner_classes;

public class TestAnonymousInner {
	
	
	public static void main(String[] args) {
		
		//anonymous class
		new Person() {
			@Override
			public void eat() {
				System.out.println("doooh!");
			}
		}.eat();
		
		//anonymous interface
		new Eatable() {
			
			@Override
			public void eat() {
				
			}
		}.eat();
		
	}

}
