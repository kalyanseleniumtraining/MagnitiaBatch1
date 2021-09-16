package exceptionHandling;

public class RunTimeExceptionTest {

	public static void main(String[] args) {

		int a = 100;
		int b = 0;
		String str = null;

		try {
			System.out.println(a / b);
			System.out.println(str.length());

		} catch (Exception obj) {
			System.out.println(obj.getMessage());
		}

		finally {
			System.out.println("Division completed");

			System.out.println("I am last line of the prog");
		}

	}

}
