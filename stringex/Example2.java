package stringex;

public class Example2 {
	public static void main(String[] args) {
		String s1="hello";
		char[] charArray=s1.toCharArray();
		for(char ch:charArray)
			System.out.println(ch);
		System.out.println(s1.length());
		System.out.println("Welcome".toLowerCase());
		System.out.println("Welcome".toUpperCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		s1=s1.toUpperCase();
		System.out.println(s1);
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}
	}
}
