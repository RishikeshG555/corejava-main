package basics;
import java.util.Scanner;
public class lec3 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        System.out.println("next()");
        String name=s.next();
        System.out.println("my name is "+name);

        s.nextLine();
        System.out.println("next()");
        String fullName=s.nextLine();
        System.out.println("my name is "+fullName);

        System.out.println("character");
        char ch=s.nextLine().charAt(0);
        System.out.println("character is "+ch);
        s.close();
    }
}
