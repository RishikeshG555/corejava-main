package collectionExample;

import java.util.ArrayList;
import java.util.Collections;

public class Example3 {

	public static void main(String[] args) {
		ArrayList<Product> li = new ArrayList<Product>();
		li.add(new Product(101, "Laptop", 45000));
		li.add(new Product(102, "Tablet", 35000));
		li.add(new Product(103, "Mobile", 25000));
		for (Product i : li) {
			System.out.println(i);
		}
		li.forEach(n->{
			for (int j = 1; j <= 10; j++) {
				System.out.println(n.getPrice()+" X "+j+" = "+(j*n.getPrice()));
			}
		});
		li.forEach(p->System.out.println(p.getName()));
		Collections.sort(li,(o1,o2)->o2.getPrice()-o1.getPrice());
		System.out.println(li);
		Collections.sort(li,(o1,o2)->o1.getPrice()-o2.getPrice());
		System.out.println(li);
		Collections.sort(li,(o1,o2)->o2.getName().compareTo(o1.getName()));
		System.out.println(li);
		li.removeIf(n->n.getPrice()>35000);
		System.out.println(li);
	}

}
