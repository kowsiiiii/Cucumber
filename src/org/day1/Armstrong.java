package org.day1;

public class Armstrong {
	public static void main(String[] args) {   

		int t = 153;
		int a = t, b, c = 0;
		while (a > 0) {

			b = a % 10;          //b=153%10=3;  //b=15%10=5;    //b=1%10=1;
			c = c + (b * b * b); //c=0+27=27;   //c=27+125=152; //c=152+1=153;
			a = a / 10;          //a=153/10=15; //a=15/10=1;    //a=1/10=0;
		}
		System.out.println(c);
		
		if (t == c) {
			System.out.println("armstrong");

		} else {
			System.out.println("non armstrong");
		}
	}

}
