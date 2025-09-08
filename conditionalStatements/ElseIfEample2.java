package conditionalStatements;

public class ElseIfEample2 {

	public static void main(String[] args) {
		
		int a=1000;
		int b=1000;
		int c=10000;
		
		if (a>b&&a>c) {
			System.out.println("a is greatest");
		} else if (a==b&&b==c) {
			System.out.println("all are equal");
		} else if (a==b&&b>c) {
			System.out.println("a and b are equal and greatest");
		} else if (b>c) {
			System.out.println("b is greatest");
		} else if (c==a) {
			System.out.println("c and a are equal and greatest");
		} else if (c>b) {
			System.out.println("c is greatest");
		} else if (c==b) {
			System.out.println("b and c are equal and greatest");
		}

	}

}
