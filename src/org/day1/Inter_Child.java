package org.day1;

public class Inter_Child implements Inter_Parent1, Inter_Parent2 {

	@Override
	public void person3() {
		System.out.println("corona");

	}

	@Override
	public void person4() {
		System.out.println("cancer");
	}

	@Override
	public void person1() {
		System.out.println("Diabeties");
	}

	@Override
	public void person2() {
		System.out.println("Malaria");
	}
	
	public static void main(String[] args) {
		Inter_Child a=new Inter_Child();
		a.person1();
		a.person2();
		a.person3();
		a.person4();
	}

}
