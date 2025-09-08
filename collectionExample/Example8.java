package collectionExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example8 {
	public static void main(String[] args) {
		List<Integer> lis = Arrays.asList(12,13,11,15,14,90);
		System.out.println(lis);
		lis.forEach(a->{
			if(a%2==0)
				System.out.println(a);
		});
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(12);
		li.add(1,5);
		li.add(13);
		li.add(90);
		li.add(45);
		//li.remaove(0);
		//li.removeAll(lis);
		li.removeIf(n->n>15);
		System.out.println(li);
		li.clear();
		System.out.println(li.isEmpty());
	}
}