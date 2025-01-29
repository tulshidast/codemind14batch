package javapractices;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CharacterCountUsingMap {

	public static void main(String[] args) {

		String s = "Welcome to codemind technology";

		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {

			if (!(map.containsKey(s.charAt(i)))) {

				map.put(s.charAt(i), 1);
			}

			else {

				map.put(s.charAt(i), (map.get(s.charAt(i)) + 1));

			}

		}

		Set<Entry<Character, Integer>> set = map.entrySet();

		for (Entry<Character, Integer> ss : set) {
			System.out.println(ss.getKey() + " : " + ss.getValue());
		}

	}

}
