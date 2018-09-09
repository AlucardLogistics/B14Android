package com.dragos.threads;

public class WorkerThread implements Runnable {
	
	
	private String message;
	
	public WorkerThread(String msg) {
		message = msg;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " start message= " + message);
		processing();
		System.out.println(Thread.currentThread().getName() +  " end");
		
	}

	private void processing() {

		try {
			Thread.sleep(2 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}

}
