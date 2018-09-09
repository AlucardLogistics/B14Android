package com.dragos.threads;

public class TestThreads {

	public static void main(String[] args) {
		
		MyThread thread1 = new MyThread("first "); // new thread created in memory
		MyThread thread2 = new MyThread("second ");
		MyThread thread3 = new MyThread("third ");
		thread1.start();
		
		try {
			thread1.join(1500);//join thread will complete first then the other threads will run 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		thread2.setName("SecondThread");
		System.out.println("is alive: " + thread1.isAlive());
		thread2.start();
		thread3.start();
		// telling the scheduler that tread is ready to be executed
//		MyThreadInterface mti = new MyThreadInterface();
//		Thread t1 = new Thread(mti);
//		t1.start();
		
		//execute threads in sequence -- will work like a method not like a thread
//		thread1.run();
//		thread2.run();

	}

}
