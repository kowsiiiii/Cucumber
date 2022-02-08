package org.day1;

public class Single_Child extends Single_Parent {

	private void child() {
		System.out.println("child class");

	}

	@Override
	public void parent() {
		super.parent();
	}

	public static void main(String[] args) {
		Single_Child a = new Single_Child();
		a.parent();
		a.child();

	}
}
