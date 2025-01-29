package javapractices;

public class SuperKeywordUse {

	public static void main(String[] args) {

		ChildClass childClass = new ChildClass(500);
		childClass.testSuper();

	}

}

class ParentClass {

	int parentA;

	public ParentClass(int a) {
		parentA = a;
	}

}

class ChildClass extends ParentClass {

	public ChildClass(int a) {
		super(a);
	}

	int parentA = 200;

	public void testSuper() {
		
		System.out.println(super.parentA + parentA);
	}

}
