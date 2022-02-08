package org.day1;

public class Variables {
	
	static String str;  //static 

	static int a; // instance or class

	private static  void add() {
		int a = 10; // local variable
		System.out.println(a);

	}

	private static void sub() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		System.out.println(str);
		
		add();
		
		sub();
	}

}
