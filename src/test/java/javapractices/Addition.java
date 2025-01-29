package javapractices;

import seleniumpractices.Calculator;

//2. import package.classname;

//import seleniumpractices.Calculator;
//import seleniumpractices.Multiplication;

// 1. import package.*;
//import seleniumpractices.*;

public class Addition extends Calculator {

	public static void main(String[] args) {

		// 3. fully qualified name.
		Addition ad = new Addition();
		int addition = ad.add(100, 200);

		seleniumpractices.Multiplication multiplication = new seleniumpractices.Multiplication();
		int mulResult = multiplication.mul(2, 5);

		System.out.println("Addition of given numbers = " + addition);
		System.out.println("Multiplication of given numbers = " + mulResult);
		
		mulResult = multiplication.mul(2, 5);

	}

}
