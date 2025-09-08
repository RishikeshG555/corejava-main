package basics;
import java.util.Scanner;
public class lec5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number from 1 to 3");
        int n=s.nextInt();
        if(n==2){
            System.out.println("English");
        }
        else if(n==1){
            System.out.println("Hindi");
        }
        else if(n==3){
            System.out.println("Marathi");
        }
        else {
            System.out.println("Invalid input");
        }
        s.close();
    }
}
