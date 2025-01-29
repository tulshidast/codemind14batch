package javapractices;

public abstract class MyClass {
	
	int c=30;
	
	public static final int d=40;

	// non abstract method
	public int add(int a, int b) {
		return a + b;
	}

	// abstract method
	/**
	 * .This method is used to do multiplication of provided numbers.
	 * 
	 * @param a provide first number
	 * @param b provide second number
	 * @return it will return float value
	 * 
	 */
	abstract float mul(int a, int b);

}

interface MyInterface{
	
	public static final int PANNUMBER=123456;
	
	float age=40;
	
	// abstract
   abstract public void m1();
   public void m2();
   
	
}
