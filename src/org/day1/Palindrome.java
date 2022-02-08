package org.day1;

public class Palindrome {

	public static void main(String[] args) {

		int t = 121;
		int a = t, b, c = 0;

		while (a > 0) {

			b = a % 10;       // b=121%10=1;   //b=12%10=2; //b=1%10=1;
			c = (c * 10) + b; // c=0+1=1;      //c=10+2=12; //c=120+1=121;
			a = a / 10;       // a=121/10=12;  //a=12/10=1; //a=1/10=0;
		}
		System.out.println(c);

		if (t == c) {
			System.out.println("palindrome");
		} else {
			System.out.println("non paindrome");
		}
	}

	// 121%10 = 12.1 --> 1
	// 121/10 = 12.1 --> 12

}
