package abstraction;
@FunctionalInterface
interface S{
	void displayName(String name, int age);
}
@FunctionalInterface
interface T{
	void display(int n);
}
@FunctionalInterface
interface K{
	int add(int a,int b);
}
@FunctionalInterface
interface J{
	int square(int n);
}
@FunctionalInterface
interface L{
	int fact(int n);
}
public class Example7 {

	public static void main(String[] args) {

		S s=(name, age)->System.out.println("My name is "+name+" age is "+age);
		s.displayName("Zalak", 22);
		
		T t=(num)->{
			for(int i=1;i<=num;i++) {
				System.out.println(i);
			}
		};
		t.display(8);
		K k=(a,b)->a+b;
		System.out.println(k.add(10, 20));
		J j=(n)->n*n;
		System.out.println(j.square(6));
		L l=(n)->{
			int fac=1;
			for(int i=1;i<=n;i++) {
				fac=fac*i;
			}
			return fac;
		};
		System.out.println(l.fact(5));
	}

}
