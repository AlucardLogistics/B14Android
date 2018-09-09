package com.dragos.threads;

public class ThreadsClass implements Runnable {

	public static void main(String[] args) {
		
		ThreadsClass t1 = new ThreadsClass();
		Thread th1 = new Thread(t1);
		
		th1.start();
		
		DbThread db1 = new DbThread();
		db1.start();

	}

	@Override
	public void run() {
		System.out.println("ThreadsClass: run() -> th1 Running a task");
		
		
	}

}
