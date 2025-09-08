package conditionalStatements;

import java.util.Scanner;

public class SwitchExample2 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a character");
		char c=s.nextLine().toLowerCase().charAt(0);
		switch (c) {
		case 'a':
		case 'e':
		case 'o':
		case 'i':
		case 'u':
			System.out.println(c+" is a vowel");
			break;
		default:
			System.out.println(c+" is a conconent");
		}
		s.close();
	}
}