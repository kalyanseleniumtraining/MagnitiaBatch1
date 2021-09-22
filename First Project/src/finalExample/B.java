package finalExample;

public class B extends A {

	public void add() {
		System.out.println(100 + 200);
		super.add();
	}

	public static void main(String[] args) {

		B obj = new B();
		obj.add();

	}

}
