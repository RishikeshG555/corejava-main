package collectionExample;

import java.util.PriorityQueue;

public class Example14 {
	 public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(12);
		pq.add(19);
		pq.add(20);
		pq.add(33);
		pq.add(23);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
	}
}
