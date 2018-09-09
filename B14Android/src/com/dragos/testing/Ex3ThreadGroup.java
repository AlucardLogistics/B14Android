package com.dragos.testing;

public class Ex3ThreadGroup implements Runnable {

	public static void main(String[] args) {

		Ex3ThreadGroup tgd = new Ex3ThreadGroup();
		ThreadGroup tg = new ThreadGroup("Group of threads");
		
		Thread t1 = new Thread(tg, tgd, "one");
		t1.setPriority(Thread.MAX_PRIORITY);
		Thread t2 = new Thread(tg, tgd, "two");
		Thread t3 = new Thread(tg, tgd, "three");
		
		t1.start();
		t2.start();
		t3.start();

	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}

}
