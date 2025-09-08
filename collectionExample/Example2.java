package collectionExample;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Example2 {

	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(12);
		li.add(1,5);
		li.add(13);
		li.add(90);
		li.add(45);
		System.out.println(li);
		for (Integer i : li) {
			System.out.println(i);
		}
		System.out.println(li.size());
		System.out.println(li);
		li.set(2, 100);
		System.out.println(li);
		System.out.println(li.get(1));
		Consumer<Integer> obj=(n)->System.out.println(n);
		obj.accept(12);
		li.forEach(obj);
	}

}
