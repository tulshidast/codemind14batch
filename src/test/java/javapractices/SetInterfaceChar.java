package javapractices;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceChar {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();

		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(10);
		
		for(Integer i:set)
		{
			System.out.println(i);
		}

	}

}
