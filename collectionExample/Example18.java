package collectionExample;

import java.util.HashMap;

public class Example18 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Nisha");
		hm.put(4, "Ankita");
		hm.put(3, "Ananya");
		hm.put(2, null);
		hm.put(null, null);
		hm.put(null, "a");
		hm.putIfAbsent(null, "b");
		System.out.println(hm);
		System.out.println(hm.get(1));
		System.out.println(hm.keySet());
		for (Integer i:hm.keySet()) {
			System.out.println(i+" "+hm.get(i));
		}
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		System.out.println();
		System.out.println(hm.getOrDefault(11, "*********"));
	}
}