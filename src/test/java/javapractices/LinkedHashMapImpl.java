package javapractices;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapImpl {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> studentData = new LinkedHashMap<Integer, String>();
		studentData.put(1, "sachin");
		studentData.put(4, "sourav");
		studentData.put(3, "hardik");
		studentData.put(5, "virendra");
		studentData.put(8, "rohit");

		Set<Entry<Integer, String>> set = studentData.entrySet();

		for (Entry<Integer, String> e : set) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

	}

}
