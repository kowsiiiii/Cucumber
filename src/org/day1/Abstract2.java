package org.day1;

public class Abstract2 extends Abstract1 {
	@Override
	public void password() {
		System.out.println("test@123");

	}

	public static void main(String[] args) {
		Abstract2 a = new Abstract2();
		a.name();
		a.mailId();
		a.password();
	}

}
