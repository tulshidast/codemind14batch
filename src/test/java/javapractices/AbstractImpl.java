package javapractices;

public class AbstractImpl extends MyClass implements MyInterface {

	@Override
	float mul(int a, int b) {

		return a * b;
	}

	AbstractImpl() {
		super();
	}

	public void sub() {
		System.out.println(100 - 50);
	}

	@Override
	public void m1() {
		System.out.println("m1");

	}

	@Override
	public void m2() {
		super.add(10, 20);
		System.out.println("m2");

	}

}
