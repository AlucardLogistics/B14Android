package com.dragos.threads_two;

/**
 * This class is a shared data
 * @author Alucard
 *
 */
public class Table {
	
	/**
	 * Shared data structure
	 * @param no
	 */
	synchronized /*static*/ void printTable(int no) { //sync method will run the threads one by one
		System.out.println("Current thread name: " + Thread.currentThread().getName());
		//synchronized (this) { //sync block
			for(int i = 1; i < 6; i++) {
				System.out.println(no*i + "\n");
				try {
					Thread.sleep(1 * 1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
			}
		//}
		
	}

}
