package conditionalStatements;

import java.util.Scanner;

public class SwitchExample3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int n1=s.nextInt();
		int n2=s.nextInt();
		System.out.println("1:add 2:sub 3:mul 4:div");
		String a=s.nextLine();
		switch (a) {
		case "1":
			System.out.println("Addition of "+n1+" and "+n2+" is "+(n1+n2));
			break;
		case "2":
			System.out.println("Substraction of "+n1+" and "+n2+" is "+(n1-n2));
			break;
		case "3":
			System.out.println("Multiplication of "+n1+" and "+n2+" is "+(n1*n2));
			break;
		case "4":
			System.out.println("Division of "+n1+" and "+n2+" is "+(n1/n2));
			break;

		default:
			System.out.println("Invalid input.");
			break;
		}
		s.close();
	}

}
