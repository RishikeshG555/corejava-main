package stringex;

public class Example3 {

	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		String s4=new String("hello");
		System.out.println(s1==s2);
		System.out.println(s4==s3);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("hello"));
		System.out.println(s1.equals("Hello"));
		System.out.println(s1.equalsIgnoreCase("Hello"));
	}

}