package stringex;

import java.util.Scanner;

public class Example5 {
	public static void main(String[] args) {
		System.out.println("Hello".charAt(3));
		String s1="hello";
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
		System.out.println("        he llo     ".trim());
		System.out.println("Welcome".indexOf("come"));
		System.out.println("Welcome".toLowerCase().indexOf('e',2));
		System.out.println("eee".lastIndexOf('e'));
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.next();
		System.out.println(str.indexOf('a',str.indexOf('a')+1));
		System.out.println(str.substring(2,str.length()));
		String s2="s.fwef.java";
		System.out.println(s2.substring(0,s2.lastIndexOf('.')));
		System.out.println(s2.substring(s2.lastIndexOf('.')+1));
		System.out.println(str.replace('a', '*'));
		System.out.println(" hel213554lo   ".replaceAll("\\D","1"));
		sc.close();
	}
}