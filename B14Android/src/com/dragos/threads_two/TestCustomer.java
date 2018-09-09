package com.dragos.threads_two;

public class TestCustomer {

	public static void main(String[] args) {

		final Customer c1 = new Customer();
		//Customer c2 = new Customer();
		
		new Thread() {
			@Override
			public void run() {
				c1.withdraw(15000);
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				c1.deposit(10000);
			};
		}.start();

	}

}
