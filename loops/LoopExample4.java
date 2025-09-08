package loops;

import java.util.Scanner;

public class LoopExample4 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number to find it's factors");
		int n=s.nextInt();
		System.out.print("Factors of "+n+" are :");
		int count=0;
		for (int i = 1; i <= n/2; i++) {
			if(n%i==0) {
				if (i!=(n/2)) {
					System.out.print(i+", ");
				} else {
					System.out.print(i+".");
				}
				count++;
			}
			
		}
		System.out.println();
		System.out.println(n+" has "+count+" factors");
		s.close();

	}

}
