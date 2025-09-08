package abstraction;

import java.util.ArrayList;

public class Example22 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i <= 1000; i++) {
			al.add(i);
		}
		System.out.println(al);
		Integer a=al.parallelStream().findAny().get();
		System.out.println(a);
		al.parallelStream().forEach(n->System.out.print(n+" "));
	}
}