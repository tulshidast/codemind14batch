package javapractices;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetImpl {

	public static void main(String[] args) {

		LinkedHashSet<Integer> adharNumber = new LinkedHashSet<Integer>();

		adharNumber.add(123456);
		adharNumber.add(123457);
		adharNumber.add(123458);
		adharNumber.add(123459);
		adharNumber.add(123410);
		// duplicate
		adharNumber.add(123456);
		adharNumber.add(null);

		for (Integer a : adharNumber) {

			System.out.println(a);
		}

		System.out.println("###############################################");

		LinkedHashSet<Integer> l = new LinkedHashSet<Integer>();

		// add method used to add element at last
		l.add(10);
		l.add(20);

		// this is used to add element at specified index
		l.add(100);

		LinkedHashSet<Integer> l2 = new LinkedHashSet<Integer>();

		l2.addAll(l);

		l2.add(30);
		l2.add(40);

		// Removes the element at the specified position in this list.
		l2.remove(3);

		// Removes from this list all of its elements that are contained in thespecified
		// collection.
		l2.removeAll(l);

		for (Integer i : l2) {
			System.out.println(i);
		}
		System.out.println("################################");

		l2.add(100);
		l2.add(200);
		l2.add(300);
		l2.add(150);
		l2.add(600);
		l2.add(90);

		// Removes all of the elements from this list.
		// l2.clear();

		System.out.println("################################");

		// Returns true if this list contains no elements.
		System.out.println("l2 is empty = " + l2.isEmpty());

		System.out.println("################################");

		// Returns the number of elements in this list.
		System.out.println("size of l2 = " + l2.size());

		System.out.println("################################");

		System.out.println("l2 contains 600 = " + l2.contains(600));

		System.out.println("l2 contains 6000 = " + l2.contains(6000));

		System.out.println("################################");

		for (Integer i : l2) {
			System.out.println(i);
		}

		System.out.println("################################");

		Iterator<Integer> it = l2.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

		System.out.println("################################");

	}

}
