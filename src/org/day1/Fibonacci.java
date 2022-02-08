package org.day1;

public class Fibonacci {

	public static void main(String[] args) {
		int a = 0, b = 1, c;
		for (int i = 0; i < 10; i++) {

			c = a + b; // c=0+1=1; //c=1+1=2; //c=1+2=3; //c=2+3=5;
			a = b;     // a=1;     //a=1;     //a=2;     //a=3;
			b = c;     // b=1;     //b=2;     //b=3;     //b=5;

			System.out.println(c);

		}
	}

}
