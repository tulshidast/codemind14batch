package seleniumpractices;

import javapractices.TestProtected;

public class ProtectedUsage extends TestProtected {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		System.out.println(calculator.add(20, 30));
		
		ProtectedUsage protectedUsage = new ProtectedUsage();
		System.out.println(protectedUsage.pro);

	}

}
