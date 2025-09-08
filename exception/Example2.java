package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=0;
		try {
			n=sc.nextInt();			
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Square of "+n+" is "+(n*n));
		sc.close();
	}
}
