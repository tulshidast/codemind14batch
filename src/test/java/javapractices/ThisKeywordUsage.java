package javapractices;

public class ThisKeywordUsage {

	// instance/object/example member variable
	int a;
	int b;

	public ThisKeywordUsage() {
		System.out.println("Default constructor");
	}

	public ThisKeywordUsage(int a) {
		System.out.println(a);
	}

	public ThisKeywordUsage(float a) {
		this(100);
		System.out.println(a);

		System.out.println("Hashcode using this = " + this.hashCode());
	}

	public ThisKeywordUsage(int a, int b) {
// this keyword is used to differentiate betn local and instance member variables
		this.a = a;
		this.b = b;
		System.out.println(this.a + this.b);
	}

	public static void main(String[] args) {

//		ThisKeywordUsage thisKeywordUsage = new ThisKeywordUsage();
//		System.out.println(thisKeywordUsage.a);

//		ThisKeywordUsage thisKeywordUsage = new ThisKeywordUsage(10, 20);

		ThisKeywordUsage thisKeywordUsage_1 = new ThisKeywordUsage(10.15f);

		System.out.println("Hashcode using reference variable = " + thisKeywordUsage_1.hashCode());
	}

}
