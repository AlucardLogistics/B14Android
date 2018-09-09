package com.dragos.testing;

public class Ex2ThreadSync extends Thread {
	
	Ex2TableForSync table;
	int num;
	
	public Ex2ThreadSync(Ex2TableForSync t, int n) {
		this.table = t;
		this.num = n;
	}
	
	@Override
	public void run() {
		table.printTable(num);
	}

}
