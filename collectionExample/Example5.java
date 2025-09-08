package collectionExample;

public class Example5 {

	public static void main(String[] args) {
		char c=64;
		int n=3;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=i ; j++) {
				if (i==n) {
					System.out.print(c);
					c--;
				} else {
					c++;
					System.out.print(c);
				}
			}
			System.out.println();
		}

	}

}
