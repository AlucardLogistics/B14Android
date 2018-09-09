package com.dragos.testing;

public class Ex1Customer {
	
	private int balance = 100;
	
	public int getBalance() {
		return balance;
	}
	
	synchronized public void deposit(int amount) {
		System.out.println("desposit into account " + amount);
		balance += amount;
		System.out.println("new balance is " + balance);
		notify();
		//System.out.println("new blanance is " + balance);
	}
	
	synchronized public void withdraw(int amount) {
		System.out.println("withdraw from account " + amount);
		if(amount > balance) {
			System.out.println("not enough money");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("retry withdraw of " + amount);
		balance -= amount;
		System.out.println("new blance is " + balance);
	}

}
