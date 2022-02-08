package org.day1;

public class Override2 extends Override1 {
//	private void price(int price) {
//		System.out.println(price);
//	}

	@Override
	public void product(String name) {
		super.product(name);
		//this.price(50);
	}

	public static void main(String[] args) {
		Override2 a = new Override2();
		a.product("pencil");
		//a.price(100);

	}

}
