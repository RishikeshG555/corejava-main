package exception;

import java.util.Scanner;

class Aa{
	public void checkAge(int age) {
		if(age<18){
			throw new InvaliAgeException("you are still under age");
		}
	}
}

class Stu{
	public void findStudent(int id) throws IdNotFoundException {
		if(id>100) {
			throw new IdNotFoundException("Student Not Found");
		}
	}
}

public class Example11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age for drivers licence");
		int age=sc.nextInt();
		Aa a = new Aa();
		try {
			a.checkAge(age);
		} catch(InvaliAgeException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
		Stu s = new Stu();
		try {
			s.findStudent(111);
		} catch (IdNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
