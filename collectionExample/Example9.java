package collectionExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Example9 {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(12);
		ll.add(45);
		System.out.println(ll.add(90));
		ll.forEach(n->System.out.println(n));
		System.out.println(ll.contains(200));
		Iterator<Integer> it=ll.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		ArrayList<String> al = new ArrayList<String>();
		al.add("apple");
		al.add("banana");
		al.add("mango");
		LinkedList<String> l1 = new LinkedList<String>(al);
		System.out.println(l1);
		Vector<Integer> ve = new Vector<Integer>();
		ve.add(12);
		System.out.println(ve.capacity());
		for (int i = 1; i < 21; i++) {
			ve.add(i);
		}
		System.out.println(ve.capacity());
	}
}
