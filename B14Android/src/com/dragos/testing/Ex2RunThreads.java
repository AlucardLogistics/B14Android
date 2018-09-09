package com.dragos.testing;

public class Ex2RunThreads {

	
	
	public static void main(String[] args) {
		
		Ex2TableForSync table = new Ex2TableForSync();
		
		Ex2ThreadSync t1 = new Ex2ThreadSync(table, 1); 
		Ex2ThreadSync t2 = new Ex2ThreadSync(table, 10);
		Ex2ThreadSync t3 = new Ex2ThreadSync(table, 100);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
