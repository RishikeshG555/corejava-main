package polymorphism;

class calculator{
	int add(int a,int b) {
		return a+b;
	}
	float add(float a,int b) {
		return a+b;
	}
	float add(int a,float b) {
		return a+b;
	}
	float add(float a,float b) {
		return a+b;
	}
	int add(int a,int b, int c) {
		return a+b+c;
	}
	float add(int a,int b,float c) {
		return a+b+c;
	}
	double sub(int a, double b, double c) {
		return a+b-c;
	}
	double sub(double b, double c) {
		return b-c;
	}
	int sub(int a, int b, int c) {
		return a+b-c;
	}
	int sub(int a, int b) {
		return a-b;
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		System.out.println(new calculator().add(1, 2));
		System.out.println(new calculator().add(2, 12));
		System.out.println(new calculator().add(13, 22));
		System.out.println(new calculator().add(10, 20));
		System.out.println(new calculator().add(10, 20, 30));
		System.out.println(new calculator().add(5, 8, 6));
		
		System.out.println(new calculator().sub(2.2, 1.1));
		System.out.println(new calculator().sub(2, 1));
		System.out.println(new calculator().sub(3, 2.2, 1.1));
		System.out.println(new calculator().sub(3, 2, 1));
	}

}
