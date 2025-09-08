package abstraction;

import java.util.Arrays;

import java.util.List;
import java.util.Optional;

public class Example20 {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(12,11,10,13,16,19);
		l.stream().filter(p->{
			boolean a=true;
			for (int i = 2; i < p/2; i++) {
				if(p%i==0)
					a=false;
			}
			return a;
		}).forEach(p->System.out.println(p));
		List<String> al = Arrays.asList("Nisha","Manisha","Anjani","Nikita");
		al.stream().filter(p->!p.toLowerCase().startsWith("n")).forEach(p->System.out.println(p));
		long q=al.stream().count();
		System.out.println(q);
		boolean o=al.stream().allMatch(p->p.length()>3);
		System.out.println(o);
		boolean e=l.stream().allMatch(p->p%2==0);
		System.out.println(e);
		List<Integer> w = Arrays.asList(12,11,10,13,16,19);
		boolean r=w.stream().anyMatch(p->p%2==0);
		System.out.println(r);
		boolean t=w.stream().noneMatch(p->p%2==0);
		System.out.println(t);
		Optional<Integer> f = Optional.ofNullable(w.stream().filter(n->n<0).findFirst().orElse(5));
		System.out.println(f.get());
	}
}