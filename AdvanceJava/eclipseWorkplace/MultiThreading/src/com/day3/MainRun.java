package com.day3;

public class MainRun {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Thread2Demo());
		
		System.out.println(t.getState()); // NEW
		t.start();
		System.out.println(t.getState()); // RUNNABLE
		
		System.out.println(t.getState()); // 
		Thread.sleep(1000);
		System.out.println(t.getState()); // TIMED_WAITING
		t.join();
		System.out.println(t.getState()); // TERMINATED
//		t.run();
		System.out.println(t.getState()); // Terminated

	}
	

}
