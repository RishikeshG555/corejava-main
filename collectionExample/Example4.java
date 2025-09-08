package collectionExample;

public class Example4 {
	public static void main(String[] args) {
		int i=1;
		int n=6;
		for (int j = 0; j < n; j++) {
			if (j%2==0) {
				i=1;
				for (int k = 0; k <= j; k++) {
					System.out.print(i);
					if(i==1) {
						i=0;
					} else {
						i=1;
					}
				}
			} else {
				i=0;
				for (int k = 0; k <= j; k++) {
					System.out.print(i);
					if(i==1) {
						i=0;
					} else {
						i=1;
					}
				}
			}
			System.out.println();
		}
	}
}
