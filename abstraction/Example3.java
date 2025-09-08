package abstraction;

interface T1{
	void method1();
	int method2();
}
class A implements T1{
	public void method1() {
		System.out.println("Method 1 from A");
	}
	public int method2() {
		System.out.println("method 2 from A");
		return 0;
	}
}
public class Example3 {
	public static void main(String[] args) {
		A a=new A();
		a.method1();
		System.out.println(a.method2());
	}
}
