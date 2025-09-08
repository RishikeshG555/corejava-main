package collectionExample;

import java.util.TreeSet;

public class Example13 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>((p1,p2)->p1%10-p2%10);
		ts.add(122);
		ts.add(561);
		ts.add(989);
		System.out.println(ts);
		TreeSet<String> tst = new TreeSet<String>((p,s)->p.length()-s.length());
		tst.add("abc");
		tst.add("a");
		tst.add("ab");
		tst.add("cs");
		System.out.println(tst);
	}
}
