package abstraction;

@FunctionalInterface
interface M{
	void Show();
}
@FunctionalInterface
interface N{
	void display();
}
public class Example6 {

	public static void main(String[] args) {
		M m=new M() {
			
			@Override
			public void Show() {
				System.out.println("show method");
			}
		};
		M obj=()->System.out.println("Lambda: show");
		obj.Show();
		m.Show();
		M obj1=()->{
			System.out.println("line 1");
			System.out.println("line 2");
		};
		obj1.Show();
		N ob=()->System.out.println("N display");
		ob.display();
	}

}
