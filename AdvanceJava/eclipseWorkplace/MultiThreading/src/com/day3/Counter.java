package com.day3;

public class Counter {
	private int count;
	
	public int getCount() {
		return count;
	}
	
	public void inc() {
		count++;
	}

}

class ThreadCounter extends Thread {
	
	Counter counter;
	public ThreadCounter(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for(int i = 1; i<=10; i++) {
			counter.inc();
			System.out.println(counter.getCount());
		}
	}
}
