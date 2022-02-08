package org.day1;

public class Switch {

	public static void main(String[] args) {

		String s = "Sunday";

		switch (s) {
		case "Monday":

			System.out.println("2nd day of the week");

			break;

		case "Tuesday":

			System.out.println("3rd day of the week");

			break;

		case "Friday":

			System.out.println("6th day of the week");

			break;

		default:
			
			System.out.println("out of the weekdays");
			break;
		}
	}

}
