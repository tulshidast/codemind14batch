package javapractices;

public class OwnClass {

	public static void main(String[] args) {

		MyClass m = new AbstractImpl();
		System.out.println(m.mul(10, 5));
		
		MyInterface my = new AbstractImpl();
		
		my.m1();
		my.m2();

	}

}
