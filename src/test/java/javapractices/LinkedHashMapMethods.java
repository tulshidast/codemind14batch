package javapractices;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapMethods {

	public static void main(String[] args) {
		LinkedHashMap<String, String> data = new LinkedHashMap<String, String>();

		data.put("mh12ab4334", "sachin");
		data.put("mh13ab2332", "rohit");
		data.put("mh14ab6546", "sourav");
		data.put("mh13rt9786", "sachin");
		data.put("mh13rt9786", "sachin");
		data.put(null, null);

		LinkedHashMap<String, String> data1 = new LinkedHashMap<String, String>();

		data.put("mh13rt9789", "hardik");

		data.putAll(data1);

		Set<Entry<String, String>> set = data.entrySet();

		for (Entry<String, String> e : set) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

		System.out.println("#####################################");

		Set<Entry<String, String>> et = data.entrySet();

		Iterator<Entry<String, String>> it = et.iterator();

		while (it.hasNext()) {
			Entry<String, String> ee = it.next();
			System.out.println(ee.getKey() + " : " + ee.getValue());
		}

		System.out.println("########################################");

		System.out.println("Data is empty = " + data.isEmpty());

		System.out.println("########################################");

		System.out.println("Size is = " + data.size());

		System.out.println("########################################");

		System.out.println("Data contains mh14ab6546 = " + data.containsKey("mh14ab6546"));
		System.out.println("Data contains mh14a89798 = " + data.containsKey("mh14a89798"));

		System.out.println("Data contains mh14ab6546 = " + data.containsValue("sachin"));
		System.out.println("Data contains mh14a89798 = " + data.containsKey("abhijit"));

		System.out.println("############################################");

		data.remove("mh13ab2332", "rohit");

		data.replace(null, null, "sandeep");

		it = et.iterator();

		while (it.hasNext()) {
			Entry<String, String> ee = it.next();
			System.out.println(ee.getKey() + " : " + ee.getValue());
		}

		System.out.println("###################################");

		System.out.println(data.get("mh13rt9789"));

		System.out.println("#####################################");

		Set<String> keySet = data.keySet();

		for (String s : keySet) {
			System.out.println(s);
		}

		System.out.println("###################################");

		Collection<String> c = data.values();

		for (String ss : c) {
			System.out.println(ss);
		}

	}

}
