package loops;

import java.util.Scanner;

public class LoopExample3 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=0,p=0,z=0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter "+i+" number : ");
			int num=s.nextInt();
			if (num>0) {
				p++;
			} else if (num<0) {
				n++;
			} else {
				z++;
			}
		}
		System.out.println("Number of positive inputs are "+p);
		System.out.println("Number of negative inputs are "+n);
		System.out.println("Number of zero inputs are "+z);

		s.close();
	}

}
