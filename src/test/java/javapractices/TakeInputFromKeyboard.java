package javapractices;

import java.util.Scanner;

public class TakeInputFromKeyboard {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int a = scanner.nextInt();

		System.out.println("Enter second number: ");
		int b = scanner.nextInt();

		System.out.println("Additio of two numbers = " + (a + b));

		scanner.close();

//		while (scanner.hasNext()) {
//			
//			String s = scanner.next();
//
//			System.out.println(s);
//		}

	}

}
