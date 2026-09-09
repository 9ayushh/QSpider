package com.demo2;

public class ThreadB extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(char i = 'a'; i<='e'; i++) {
			System.out.println(i);
		}
	}
}
