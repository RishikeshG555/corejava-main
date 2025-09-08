package basics;
import java.util.Scanner;
public class lec2 {
    public static void main(String args[]){
        byte a=67;
        short b=346;
        int c=5393598;
        long d=23456785856465l;
        float e=23.3432f;
        double f=548.84687567;
        boolean g=true;
        boolean h=false;
        char i='z';
        byte j=66;
        int k=j;
        int l=78;
        short m=(short)l;
        double n=58.468878;
        float o=(float)n;
        int p=65;
        char q=(char)p;
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
        System.out.println(q);
        System.out.println("input is "+r);
        
        s.close();
    }
}