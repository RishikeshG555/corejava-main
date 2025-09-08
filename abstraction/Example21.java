package abstraction;

import java.util.Arrays;
import java.util.List;

public class Example21 {
	public static void main(String[] args) {
		Arrays.asList(12,11,1,12,111,96,11,11).stream().distinct().sorted().skip(1).forEach(n->System.out.print(n+" "));
		System.out.println();
		Arrays.asList(12,11,1,12,111,96,11,11).stream().distinct().sorted((a,b)->b-a).forEach(n->System.out.print(n+" "));
		System.out.println();
		List<Integer> al = Arrays.asList(12,11,1,12);
		Integer f = al.stream().filter(n->n<1000).findFirst().orElse(5);
		System.out.println(f);
		Integer r = al.stream().filter(n->n<1000).findFirst().get();
		System.out.println(r);
		Integer in=al.stream().findAny().get();
		System.out.println(in);
//		List<Integer> a = Arrays.asList(12,11,1,12);
//		Integer i = a.stream().filter(n->n>1000).findFirst().orElseThrow(()->new RuntimeException("Stream is empty"));
//		System.out.println(i);
	}
}