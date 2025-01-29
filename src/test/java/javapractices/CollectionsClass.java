package javapractices;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClass {
	
	int a=10;

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(10);
		list.add(50);
		// list.add(null);
		list.add(15);

		for (Integer i : list) {
			System.out.println(i);
		}

		System.out.println("#########################################");

		Collections.sort(list);

		for (Integer i : list) {
			System.out.println(i);
		}

		System.out.println("#########################################");

		Collections.reverse(list);

		for (Integer i : list) {
			System.out.println(i);
		}

		System.out.println("#########################################");

		System.out.println("Maximum from list = " + Collections.max(list));
		System.out.println("Maximum from list = " + Collections.min(list));

	}

}
