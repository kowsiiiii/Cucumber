package org.day1;

public class Constructor1 {

	// default constructor

	public Constructor1() {
		System.out.println("this is an example of default constructor");
	}

	// parameterized constructor

	public Constructor1(String name,String name1) {
		this();
		System.out.println(name+"\n"+name1);

	}
	

	public Constructor1(int age) {
		this("Rajini","vijay");
		System.out.println(age);
	}

	public Constructor1(char gender) {
		this(86);
		System.out.println(gender);

	}

	public static void main(String[] args) throws Throwable {
//		Constructor1 a=new Constructor1();
//		Constructor1 b=new Constructor1("Arjun");
//		Constructor1 c=new Constructor1(60);
//		Constructor1 d=new Constructor1('M');
//		
//		a.finalize();
//		b.finalize();
//		c.finalize();
//		d.finalize();

		Constructor1 a = new Constructor1('M');

	}

}
