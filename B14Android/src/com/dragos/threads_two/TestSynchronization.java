package com.dragos.threads_two;

public class TestSynchronization {
	
	public static void main(String[] args) {
		
		Table table1 = new Table(); // common box
		Table table2 = new Table();
		
		MyThread t0 = new MyThread(table1, 1);
		MyThread t1 = new MyThread(table1, 10);
		
		MyThread t2 = new MyThread(table2, 100);
		MyThread t3 = new MyThread(table2, 1000);
		
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		
	}

}
