package org.day1;

public class Hier_Class2 extends Hier_Parent {
	private void actor1() {
		System.out.println("Actor1 is : Ajith");
	}

	private void actor2() {
		System.out.println("Actor2 is : Simbu");
	}

	@Override
	public void stars() {
		super.stars();
	}

	public static void main(String[] args) {
		Hier_Child1 a = new Hier_Child1();
		Hier_Class2 b = new Hier_Class2();

		a.sports();
		a.player1();
		a.player2();
		b.stars();
		b.actor1();
		b.actor2();

	}
}
