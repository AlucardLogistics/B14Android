package com.dragos.testing;

public class Ex2TableForSync {
	
	
	synchronized public void printTable(int n) {
		System.out.println("Thread name: " + Thread.currentThread().getName());
		for(int i = 1; i<= 5; i++) {
			System.out.println(n*i);
			
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
//	synchronized public void printTable(int n){
//		System.out.println("Name of thread: " + Thread.currentThread().getName());
//		for(int i = 1; i < 5; i++) {
//			System.out.print(n*i + "\n");
//			
//			try {
//				Thread.sleep(700);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}

}
