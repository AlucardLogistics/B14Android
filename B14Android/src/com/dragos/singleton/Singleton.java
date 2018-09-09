package com.dragos.singleton;

public class Singleton {
	
	private static Singleton instance = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return instance;
	}
	
//	public static void main(String[] args) {
//		Singleton singleton = Singleton.getInstance();
//	}

}
