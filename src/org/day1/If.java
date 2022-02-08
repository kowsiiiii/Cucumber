package org.day1;

public class If {

	public static void main(String[] args) {

		int marks = 85;

		if (marks < 70 || marks <= 100 ) {

			System.out.println("First class");

		}
		
		else if (marks>=50) {
			
			System.out.println("Average class");
			
		}

		else {

			System.out.println("fail");
		}
	}

}
