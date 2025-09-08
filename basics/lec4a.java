package basics;
import java.util.Scanner;
public class lec4a {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        if (n%4==0){
            System.out.println("multiple of four.");
        }
        else{
            System.out.println(((n/4)*4)+4);
        }
        s.close();
    }
}