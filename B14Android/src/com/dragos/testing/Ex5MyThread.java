package com.dragos.testing;

public class Ex5MyThread extends Thread {
	
	@Override
	public void run() {
		
		for(int i =0; i<5; i++) {
			System.out.println(Thread.currentThread().getName() + " " +  i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Ex5MyThread obj = new Ex5MyThread();
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		Thread t3 = new Thread(obj);
		
		t1.start();
		try {
			t1.join(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
		t3.start();
		
	}

}
