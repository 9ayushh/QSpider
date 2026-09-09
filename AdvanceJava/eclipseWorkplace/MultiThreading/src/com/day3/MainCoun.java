package com.day3;

public class MainCoun {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Counter c = new Counter();
		
		ThreadCounter t1 = new ThreadCounter(c);
		t1.start();
		
		t1.join();
		
		ThreadCounter t2 = new ThreadCounter(c);
		t2.start();
		
		t2.join();
		
		System.out.println("---------------------------"+c.getCount());
		
		
	}

}
