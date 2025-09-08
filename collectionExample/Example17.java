package collectionExample;

import java.util.ArrayDeque;

public class Example17 {
	public static void main(String[] args) {
		ArrayDeque<Integer> aq=new ArrayDeque<Integer>();
		aq.add(12);
		aq.add(10);
		aq.add(9);
		aq.add(10);
		aq.add(16);
		aq.add(98);
		System.out.println(aq.pop());
		System.out.println(aq.poll());
	}
}