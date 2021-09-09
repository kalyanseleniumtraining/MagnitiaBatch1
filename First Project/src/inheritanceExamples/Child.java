package inheritanceExamples;

public class Child extends Parent {

	public void sub() {

		System.out.println(100 - 6);

	}

	public static void main(String[] args) {

		Child ch = new Child();

		ch.sub();

	}

}
