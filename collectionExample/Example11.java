package collectionExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Example11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(12);
		hs.add(11);
		hs.add(16);
		hs.add(12);
		System.out.println(hs);
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(55);
		al.add(25);
		al.add(55);
		al.add(20);
		HashSet<Integer> hs2 = new HashSet<Integer>(al);
		System.out.println(hs2);
		HashSet<String> h = new HashSet<String>();
		for (int i = 0; i < 5; i++) {
			System.out.println("enter "+(i+1)+" fruit name: ");
			h.add(sc.next().toLowerCase());
		}
		System.out.println(h);
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(9);
		lhs.add(10);
		lhs.add(16);
		lhs.add(98);
		lhs.add(null);
		System.out.println(lhs);
		sc.close();
	}
}
