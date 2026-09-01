package com.jsp;

public class Thread1 extends Thread{
	
	@Override
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1st way to extend the thread class and the override the method
	}

}
