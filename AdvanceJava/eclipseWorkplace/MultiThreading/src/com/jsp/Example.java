package com.jsp;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// How we can create a threads
		// We have 2 ways to create a thread
		
		System.out.println("main start");
		
		System.out.println(Thread.currentThread().getName());
		
		Thread1 t1 = new Thread1();
		
		// t1.run(); // synchronous process
		t1.start(); // Asynchronous process
		
		
		Thread1 t2 = new Thread1();
		t2.start();
		
		Thread1 t3 = new Thread1();
		t3.start();
		
		System.out.println("main end");

	}

}
