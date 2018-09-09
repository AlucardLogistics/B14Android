package com.dragos.testing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.dragos.threads.WorkerThread;

public class Ex4ThreadPool {
	
	public static void main(String[] args) {
		
		ExecutorService exs = Executors.newFixedThreadPool(5);
		for(int i = 0; i<10; i++) {
			Runnable worker = new WorkerThread("" + i);
			exs.execute(worker);
		}
		
		exs.shutdown();
		System.out.println("finished");
		
	}
}
