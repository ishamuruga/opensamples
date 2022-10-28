package com.corejava.dtype;

public class IncrementsInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;

		// bitwise operator
		// -(a+1)
		System.out.println(~a);

		int c = 50;
		int d = 20;

		System.out.println(c & d);

		System.out.println(c > d);

		// boolean b = c>d;

		if (c > d) {

		}

		int x = 100;
		int y = 1;

		switch (y) {
		case 0:
			x = x + 10;
			break;
		case 1:
			x = x + 20;
			break;
		default:
			x = x + 30;
		}
		
		String names[] = new String[3];
		names[0]="SuperStar";
		names[1]="Kala";
		names[2]="Basha";
		
		for(int i=0;i<names.length;i++) {
			//System.out.println(names[i]);
		}
		
		for(String name:names) {
			System.out.println(name);
		}
		
		

		// int b = ++a;

		// int c = a++;

		// System.out.println(b);
		// System.out.println(c);

		// increament and return
		// System.out.println(++a);

		// return and increments
		// System.out.println(a++);
		// System.out.println(a);
	}

}
