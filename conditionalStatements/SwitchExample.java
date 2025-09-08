package conditionalStatements;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1:Hindi 2:English 3:Marathi");
		int n=s.nextInt();
		switch(n) {
		case 1:
			System.out.println("case 1");
			break;
		case 2:
			System.out.println("case 2");
			break;
		case 3:
			System.out.println("case 3");
			break;
		default:
			System.out.println("invalid input");
		}
		s.close();

	}

}
