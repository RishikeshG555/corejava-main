package stringex;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1:Red 2:Green 3:Purple");
		String choice=sc.next().toLowerCase();
		switch (choice) {
		case "red":
			System.out.println("red colour selected");
			break;
		case "green":
			System.out.println("green colour selected");
			break;
		case "purple":
			System.out.println("purple colour selected");
			break;

		default:
			break;
		}
		sc.close();
	}
}
