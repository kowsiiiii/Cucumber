package org.day1;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// String
		System.out.println("Enter a string : ");
		String nextLine = sc.nextLine();
		System.out.println(nextLine);

		System.out.println("Enter a single string : ");
		String next = sc.next();
		System.out.println(next);

		// int
		System.out.println("Enter a number : ");
		int nextInt = sc.nextInt();
		System.out.println(nextInt);

		// float

		System.out.println("Enter a float : ");
		float nextFloat = sc.nextFloat();
		System.out.println(nextFloat);

		// character
		System.out.println("Enter a character : ");
		char charAt = sc.next().charAt(1);
		System.out.println(charAt);
		
		sc.close();

	}

}
