package basics;
import  java.util.Scanner;
public class lec3a {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=3;
        System.out.println(--a);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);
        System.out.println(a--);
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);

        System.out.println(10&2);
        System.out.println(10|2);
        System.out.println(10^2);
        System.out.println(10<<2);
        System.out.println(10>>2);
        System.out.println(~10);
        System.out.println(5>>1);
        System.out.println(~5);
        s.close();
    }
}
