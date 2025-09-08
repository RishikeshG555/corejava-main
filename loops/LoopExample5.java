package loops;

import java.util.Scanner;

public class LoopExample5 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		int count=0;
		for (int i = 2; i < n/2; i++) {
			if (n%i==0) {
				count++;
			}
		}
		if (count==0&&n!=1) {
			System.out.println(n+" is a prime nuber");
		} else {
			System.out.println(n+" is not a prime nuber");
		}
		s.close();
	}

}
