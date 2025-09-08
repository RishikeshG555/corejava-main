package loops;

import java.util.Scanner;

public class LoopExample1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of times hello has to be printed");
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			System.out.println("Hello");
			i++;
		}
		s.close();

	}

}
