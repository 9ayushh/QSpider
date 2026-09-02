package com.jsp;

public class Thread2 extends Thread {
	@Override
	public void run() {
		for(char i = 'a'; i<='e'; i++) {
			System.out.println(i);
		}
	}
	
}
