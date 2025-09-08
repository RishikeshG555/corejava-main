package exception;

import java.util.Scanner;

public class example9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a positive number");
		int n=sc.nextInt();
		if(n<1) {
			sc.close();
			throw new ArithmeticException("number is not positive");
		}
		sc.close();
	}
}