package org.day1;

public class Hier_Child1 extends Hier_Parent {

	public void player1() {
		System.out.println("Player1 is : Sachin");
	}

	public void player2() {
		System.out.println("Player2 is : Rohit");
	}

	@Override
	public void sports() {
		super.sports();
	}

}
