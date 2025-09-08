package loops;

public class LoopExample2 {

	public static void main(String[] args) {
		int i=115;
		int a=0;
		int n=0;
		int k=0;
		int ans=0;
		while(i!=0) {
			a=i%10;
			System.out.println("Square of "+a+" is "+(a*a));
			k=(k*10)+a;
			ans+=a;
			i/=10;
			n++;
		}
		System.out.println("number of digits in are "+n);
		System.out.println("Reverse of number is "+k);
		System.out.println("sum of all digit is "+ans);

	}

}
