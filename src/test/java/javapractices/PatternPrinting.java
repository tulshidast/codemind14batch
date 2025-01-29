package javapractices;

public class PatternPrinting {

	int rows = 10;

	public static void main(String[] args) {

		int count = 1;
		for (int i = 10; i >= 0; i--) {

			for (int j = i - 1; j >= 0; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= count; k++) {
				System.out.print("*");
			}
			System.out.println();
			count++;

		}

	}

}
