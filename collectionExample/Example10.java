package collectionExample;

import java.util.Stack;

public class Example10 {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(50);
		s.push(40);
		s.push(60);
		s.push(70);
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.search(40));
		System.out.println(s.empty());
		System.out.println(s.size());
	}
}