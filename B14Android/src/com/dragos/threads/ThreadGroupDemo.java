package com.dragos.threads;



public class ThreadGroupDemo implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {
		
		ThreadGroupDemo tgd = new ThreadGroupDemo();
		ThreadGroup tg1 = new ThreadGroup("my thread group");
		
		Thread t1 = new Thread(tg1, tgd, "one");
		t1.setPriority(Thread.MAX_PRIORITY);
		Thread t2 = new Thread(tg1, tgd, "two");
		t2.setPriority(Thread.MIN_PRIORITY);
		Thread t3 = new Thread(tg1, tgd, "three");
		
		t1.start();
		t2.start();
		t3.start();
		
		
//		ThreadGroupDemo runna = new ThreadGroupDemo();
//		ThreadGroup tg1 = new ThreadGroup(" my thread group");
//		
//		Thread t1 = new Thread(tg1, runna, "one");
//		t1.setPriority(Thread.MAX_PRIORITY);
//		t1.start();
//		Thread t2 = new Thread(tg1, runna, "two");
//		t2.setPriority(Thread.MIN_PRIORITY);
//		t2.start();
//		Thread t3 = new Thread(tg1, runna, "three");
//		t3.start();
//		
//		System.out.println("thread list: ");
//		tg1.list();
	}

}
