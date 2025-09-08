package conditionalStatements;

import java.util.Scanner;

public class ElseIfExample {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1:Hindi 2:English 3:Marathi");
        int n=s.nextInt();
        if(n==1){
            System.out.println("Hindi language selected");
        }
        else if(n==2){
            System.out.println("English language selected");
        }
        else if(n==3){
            System.out.println("Marathi language selected");
        }
        else {
            System.out.println("Invalid input");
        }

		s.close();
	}

}