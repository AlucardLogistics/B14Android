package test;

import java.io.File;

public class ExceptionsEx  {
	
	public static void main(String[] args) {
		
		
		try {
			test();
			
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println("MyException Caught!");
		}
		
		test3();
	}
	
	private static void test() throws MyException {
		
		System.out.println("test exceptions");
	}
	
	private static void test3() {
		try {
			test2();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("test2 Caught inside test 3");
		}
	}
	
	private static void test2() {
		if(4 == 4) {
			System.out.println("test2 throw new Arithmetic");
		}
		try {
			throw new MyException();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("asds");
		}
		
	}

}
