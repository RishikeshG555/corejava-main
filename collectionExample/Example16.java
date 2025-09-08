package collectionExample;

import java.util.LinkedList;

public class Example16 {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(12);
		ll.add(10);
		ll.add(9);
		ll.add(10);
		ll.add(16);
		ll.add(98);
		ll.forEach(n->System.out.print(n+" "));
		System.out.println();
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast());
		ll.forEach(n->System.out.print(n+" "));
		ll.removeFirst();
		ll.removeFirst();
		ll.removeFirst();
		ll.removeFirst();
		ll.removeFirst();
		System.out.println(ll.pollFirst());
	}
}
