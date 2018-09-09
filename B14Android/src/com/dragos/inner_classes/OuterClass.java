package com.dragos.inner_classes;

public class OuterClass {
	
	private int data = 50;
	
	private OuterClass() {
		System.out.println("Outer object created.");
	}
	
	
	
	private class InnerClass {
		
		public InnerClass() {
			System.out.println("Inner object created.");
		}
		
		void printData() {
			System.out.println("data: " + data); // print private vars from outer class
		}
		
		
	}
	
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass inner = outerClass.new InnerClass(); //??
		InnerClass innner = outerClass.new InnerClass(); //??
		inner.printData();
//		innner.printData();
	}

}
