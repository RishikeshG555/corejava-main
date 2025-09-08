package collectionExample;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Example12 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(12);
		ts.add(11);
		ts.add(16);
		ts.add(12);
		System.out.println(ts);
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(9);
		lhs.add(10);
		lhs.add(16);
		lhs.add(98);
		TreeSet<Integer> tst = new TreeSet<Integer>(lhs);
		System.out.println(tst);
		TreeSet<Product> li = new TreeSet<Product>((p1,p2)->p2.getId()-p1.getId());
		li.add(new Product(101, "Laptop", 45000));
		li.add(new Product(102, "Tablet", 35000));
		li.add(new Product(103, "Mobile", 25000));
		System.out.println(li);
	}
}
