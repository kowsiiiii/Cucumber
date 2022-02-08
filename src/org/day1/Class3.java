package org.day1;

public class Class3 extends Class2 {

	private void grandChild() {
		System.out.println("sports");
	}

	@Override
	public void child() {
		super.child();
	}

	@Override
	public void parent() {
		super.parent();
	}

	public static void main(String[] args) {
		Class3 a = new Class3();
		a.parent();
		a.child();
		a.grandChild();

	}

}
