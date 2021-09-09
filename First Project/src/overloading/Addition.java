package overloading;

public class Addition {

	// 3 methods which add number

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, double b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}

}
