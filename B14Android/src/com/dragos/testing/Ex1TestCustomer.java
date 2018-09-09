package com.dragos.testing;

public class Ex1TestCustomer {

	public static void main(String[] args) {
		
		Ex1Customer c1 = new Ex1Customer();
		
		System.out.println("Balance " + c1.getBalance());
		
		new Thread() {
			public void run() {
				c1.withdraw(150);
			};
		}.start();
		
		new Thread() {
			public void run() {
				c1.deposit(100);
			};
		}.start();

	}

}
