package com.dragos.threads_two;

public class Customer {
	
	int balance = 10000;
	
	synchronized public void deposit(int deposited) {
		System.out.println("going to deposit");
		this.balance += deposited;
		System.out.println("Deposit complete!");
		notify();
	}
	
	synchronized public void withdraw(int withdrawned) {
		System.out.println("going to withdraw");
		if(balance < withdrawned) {
			System.out.println("not enough balance");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
		
		this.balance -= withdrawned;
		System.out.println("Withdrawn complete!");
	}

}
