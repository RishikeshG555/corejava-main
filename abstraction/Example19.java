package abstraction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import collectionExample.Product;

public class Example19 {
	public static void main(String[] args) {
		ArrayList<Product> al = new ArrayList<Product>();
		al.add(new Product(101, "Laptop", 45000));
		al.add(new Product(102, "Tablet", 35000));
		al.add(new Product(103, "Mobile", 25000));
		al.stream().filter(p->p.getPrice()<40000).map(p->p.getName()).forEach(n->System.out.println(n));
		List<String> na=al.stream().map(p->p.getName()).collect(Collectors.toList());
		System.out.println(na);
		List<Integer> pr=al.stream().map(p->p.getPrice()).collect(Collectors.toList());
		System.out.println(pr);
	}
}