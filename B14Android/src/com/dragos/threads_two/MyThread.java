package com.dragos.threads_two;

/**
 * This class represents a thread accessing a common datastructure
 * @author Alucard
 *
 */
public class MyThread extends Thread {
	
	Table table;
	int num;
	
	public MyThread(Table t, int no) {
		table = t;
		num = no;
	}
	
	
	@Override
	public void run() {
		table.printTable(num);
	}

}
