package javapractices;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test {

	public static void main(String[] args) {
		LinkedHashSet<Integer> h1 = new LinkedHashSet<Integer>();
		h1.add(10);
		h1.add(20);

		LinkedHashSet<Integer> h2 = new LinkedHashSet<Integer>();
		h2.add(100);
		h2.add(200);
		h2.add(20);

		h2.addAll(h1);

		System.out.println("Before remove");
		for (Integer a : h2) {
			System.out.println(a);
		}

		System.out.println("########################");
		System.out.println(h2.remove(3));

		System.out.println(h2.remove(20));

		System.out.println("After remove");
		for (Integer a : h2) {
			System.out.println(a);
		}

		HashSet<String> h3 = new HashSet<String>();

		h3.add("sachin");

		h3.remove(3);

	}

}
