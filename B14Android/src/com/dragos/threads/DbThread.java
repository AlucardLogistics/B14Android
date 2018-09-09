package com.dragos.threads;

//public class DbThread extends Thread {
//	
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		super.run();
//		System.out.println("Getting data from the database!");
//	}
//
//}

public class DbThread extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("DbThread: run() -> db1 Getting ready to download database");
	}
	
}
