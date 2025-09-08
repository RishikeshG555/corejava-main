package collectionExample;

import java.util.ArrayList;
import java.util.Collections;

public class Example7 {
	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(12);
		list1.add(14);
		list1.add(15);
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(12);
		list2.add(180);
		list2.add(19);
		list1.addAll(1,list2);
		System.out.println(list1);
		list1.removeAll(list2);
		System.out.println(list1);
		list1.add(12);
		list1.retainAll(list2);
		System.out.println(list1);
		Collections.sort(list2);
		System.out.println(list2);
	}
}
