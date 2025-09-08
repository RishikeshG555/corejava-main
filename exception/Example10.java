package exception;

import java.util.Scanner;

class w{
	int square(int n) {
		if(n<0)
			throw new NegativeNumberException(n+" is negative");
		return n*n;
	}
}
public class Example10 {
	public static void main(String[] args) {
		System.out.println(new w().square(10));
		Scanner sc = new Scanner(System.in);
		System.out.println("enter user name to sign in");
		String un=sc.nextLine();
		System.out.println("enter password to sign in");
		String up=sc.nextLine();
		boolean pass=false;
		while(pass==false) {
			System.out.println("Enter user name to login");
			String u=sc.nextLine();
			System.out.println("Enter password to login");
			String p=sc.nextLine();
			try {
				if(p.equals(up)&u.equals(un)){
					pass=true;
				} else {
					throw new WrongPassException("Invalid credentials");
				}
			} catch(WrongPassException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("login successful");
		sc.close();
	}
}
