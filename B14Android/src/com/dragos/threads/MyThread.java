package com.dragos.threads;

public class MyThread extends Thread {
	
	public MyThread(String string) {
		super(string);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
//		System.out.println("new thread .. download 100tb");
		
		for(int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000); //force thread to sleep for 2 seconds
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + i);
			
		}
	}

}
