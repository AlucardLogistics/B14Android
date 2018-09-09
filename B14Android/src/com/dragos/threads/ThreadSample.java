package com.dragos.threads;

public class ThreadSample {

	public static void main(String[] args) {
		
		MyThreadInterface myTi1 = new MyThreadInterface();
		//MyThreadInterface myTi2 = new MyThreadInterface();
		
		myTi1.run();
		
		
	}

}
