package generics;

import inheritance.SchoolStudent;

class A<T>{
	void meth(T a) {
		System.out.println(a);
	}
}
public class Example2 {

	public static void main(String[] args) {
		Integer b=12;
		new A<Integer>().meth(b);
		new A<String>().meth("Hello");
		new A<SchoolStudent>().meth(new SchoolStudent());
	}

}
