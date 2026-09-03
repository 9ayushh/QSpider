package com.jsp;

public class Thread2 extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
		for(int i = 1; i<=5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
}
