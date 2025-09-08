package encapsulation;

import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Product p1 = new Product();
		p1.setProductId(13);
		System.out.println("enter product id");
		int pI=sc.nextInt();
		sc.nextLine();
		if(pI==p1.getProductId())
		System.out.println("product id is right");

		p1.setProductName("Bottel");
		System.out.println("enter product name");
		String str=sc.nextLine();
		if(str.equals(p1.getProductName()))
		System.out.println("product name is right");
		
		Categories categories = new Categories(1, "bag");
		Product p2 = new Product();
		p2.setCategories(categories);
		System.out.println("product details "+p2.getCategories().getCategoryId()+p2.getCategories().getCategoryName());
		
		Student s1 = new Student();
		s1.setRollno(12);
		System.out.print("enter code -");
		int num=sc.nextInt();
		if(s1.getRollno(num)!=-1)
			System.out.println("student rollno is "+s1.getRollno(num));
		if (!s1.getName(num).equals("n")) 
			System.out.println("student name is "+s1.getName(num));
		
		sc.close();
	}

}
