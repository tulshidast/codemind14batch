package javapractices;

public class UseOfThrow {

	public static void main(String[] args) {

		UseOfThrow useOfThrow = new UseOfThrow();

		System.out.println(useOfThrow.div(10, 0));
	}

	public int div(int num, int num2) {

		if (num2 < 1) {
			throw new ArithmeticException("Please do not try to devide by 0");
		}

		int result = num / num2;
		return result;

	}
}
