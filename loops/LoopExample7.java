package loops;

import java.util.Scanner;

public class LoopExample7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		for (int i = 2; i <= n; i++) {
			int count=0;
			for (int j = 2; j < i/2; j++) {
				if (i%j==0) {
					count++;
				}
			}
			if (count==0) {
				System.out.print(i+" ");
			}
		}
		s.close();
	}

}