package collectionExample;

import java.util.PriorityQueue;

public class Example15 {
	public static void main(String[] args) {
		PriorityQueue<Product> pq = new PriorityQueue<Product>((p,q)->q.getId()-p.getId());
		pq.add(new Product(101, "Laptop", 45000));
		pq.add(new Product(102, "Tablet", 35000));
		pq.add(new Product(103, "Mobile", 25000));
		System.out.println(pq);
		pq.forEach(p->System.out.println(p));
		System.out.println(pq.poll());
		pq.forEach(p->System.out.println(p));
		System.out.println(pq.peek());
		pq.forEach(p->System.out.println(p));
	}
}
