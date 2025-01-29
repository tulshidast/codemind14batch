package javapractices;

public class FinalKeywordUse {

	public static void main(String[] args) {

		final int adharNumber = 70;

		// we can not change final variable value
		// adharNumber=100;

		int b = 40;

		b = 60;

	}

}

class Vehicle {

	final public void changeGear() {
		System.out.println("change gear");
	}

	public void add() {
		System.out.println(10 + 20);
	}

}

final class TwoWheelerVehicle extends Vehicle {

	// we cannot override final method
//	public void changeGear() {
//		
//	}

	public void add() {

	}

}

// final class cannot be inherited

//class Bicycle extends TwoWheelerVehicle{
//	
//	
//	
//}