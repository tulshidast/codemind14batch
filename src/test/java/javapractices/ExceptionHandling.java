package javapractices;

public class ExceptionHandling {

	public static void main(String[] args) {
		ExceptionHandling exceptionHandling = new ExceptionHandling();
		int result = exceptionHandling.div(10, 5);
		System.out.println("Division result = " + result);
	}

	public int div(int num, int num2) {

		int result = 0;
		try {

			result = num / num2;

		}

		catch (ArithmeticException a) {

			System.out.println("Please do not try to devide by zero");

		}

		catch (Exception a) {

			System.out.println("Please do not try to devide by zero");

		}

		finally {

			System.out.println("Finally block execute always!!");
		}

		System.out.println("After exception");

		return result;
	}

}
