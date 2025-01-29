package javapractices;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableImpl {

	public static void main(String[] args) {

		Hashtable<Integer, String> studentData = new Hashtable<Integer, String>();
		studentData.put(1, "sachin");
		studentData.put(14, "sourav");
		studentData.put(3, "hardik");
		studentData.put(5, "virendra");
		studentData.put(8, "rohit");

		studentData.put(9, "jasprit");

		// not allowing single null key
		// studentData.put(null, "rohit");

		Set<Entry<Integer, String>> set = studentData.entrySet();

		for (Entry<Integer, String> e : set) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

	}

}
