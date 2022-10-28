package com.corejava.dtype;

public class MyWhileLoop {

	public static void main(String[] args) {
		int i=0;
		
//		while (i<=10) {
//			//System.out.println("I am from Loop.." + i);
//			//i++;
//		}
		
		do {
			System.out.println("I am from Loop.." + i);
			i++;
			if (i==5) {
				break; //continue
			}
		} while(i<=10);
		
	}

}
