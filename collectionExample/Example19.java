package collectionExample;

import java.util.LinkedHashMap;

public class Example19 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, Product> lh = new LinkedHashMap<Integer, Product>();
		lh.put(1,new Product(101, "Laptop", 45000));
		lh.put(2,new Product(102, "Tablet", 35000));
		lh.put(3,new Product(103, "Mobile", 25000));
		System.out.println(lh);
	}
}