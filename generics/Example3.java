package generics;

@FunctionalInterface
interface B<T,R>{
	R method(T a);
}
public class Example3 {

	public static void main(String[] args) {
		B<Float,Double> b=(a)->a.doubleValue();
		System.out.println(b.method(12.5f));
		//predicate
		//consumer
//		supplier
//		Function
//		comparable
//		comparator
//		list
		//optional
	}

}
