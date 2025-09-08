package basics;
import java.util.Scanner;
public class lec2a {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        System.out.println("Enter first number :");
        int a=s.nextInt();
        System.out.println("Enter second number :");
        int b=s.nextInt();

        int c=a+b;
        int d=a-b;

        System.out.println("addition is :"+c);
        System.out.println("subtraction is :"+d);

        s.close();
    }
}