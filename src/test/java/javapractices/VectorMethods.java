package javapractices;

import java.util.Vector;
import java.util.Iterator;

public class VectorMethods {

	public static void main(String[] args) {

		Vector<Integer> l = new Vector<Integer>();

		// add method used to add element at last
		l.add(10);
		l.add(20);

		// this is used to add element at specified index
		l.add(0, 100);

		Vector<Integer> l2 = new Vector<Integer>();

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

		System.out.println("0th index element = " + l2.get(0));

		System.out.println("################################");

		for (Integer i : l2) {
			System.out.println(i);
		}

		System.out.println("################################");

		for (int i = 0; i < l2.size(); i++) {
			System.out.println(l2.get(i));
		}

		System.out.println("################################");

		Iterator<Integer> it = l2.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

		System.out.println("################################");

	}

}
