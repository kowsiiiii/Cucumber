package org.day1;

public class UpCasting_Child extends UpCasting_Parent {

	private void child() {
		System.out.println("python");
	}

	@Override
	public void parent() {
		super.parent();
	}

	public static void main(String[] args) {
		UpCasting_Parent a = new UpCasting_Child();

		a.parent();

		// WebDriver driver=new ChromeDriver();

		// ChromeDriver driver=new ChromeDriver();

		// ChromeDriver driver=new WebDriver();

	}

}
