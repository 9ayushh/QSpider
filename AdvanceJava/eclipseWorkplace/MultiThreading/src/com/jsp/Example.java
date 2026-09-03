package com.jsp;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// How we can create a threads
		// We have 2 ways to create a thread
		
		System.out.println("main start");
		
		System.out.println(Thread.currentThread().getName());
		
		Thread1 t1 = new Thread1();
		t1.setName("first");
		t1.setPriority(10);
		
		// t1.run(); // synchronous process
		t1.start(); // Asynchronous process

		
//		Thread2 t2 = new Thread2();
//		t2.setName("Ritik");
//		t2.setPriority(1); // only assign when scheduler is full
//		t2.start();
//		
		Thread1 t3 = new Thread1();
		t3.start();
		
				
		t1.join(10000); // it wait until other task completed
		t3.join(500);
		
		
		System.out.println("main end");

	}

}
