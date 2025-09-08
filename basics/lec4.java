package basics;
public class lec4 {
    public static void main(String[] args) {
        boolean sub=true;
        int amt=100;
        amt=(int)(sub?amt-(amt*0.2):amt);
        System.out.println("amount is "+amt);
    }
}