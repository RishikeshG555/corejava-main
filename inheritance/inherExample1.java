package inheritance;

class p{
	void add() {
		System.out.println("add");
	}
}

class q extends p{
	void sub() {
		System.out.println("sub");
	}
}

class r extends q{
	void mul() {
		System.out.println("mul");
	}
}

class s extends r{
	void div() {
		System.out.println("div");
	}
}
public class inherExample1 {

	public static void main(String[] args) {
		
		s s=new s();
		s.add();
		s.sub();
		s.mul();
		s.div();

//		SchoolStudent scl = new SchoolStudent(101, "Nisha", "A345678");
//		CollegeStudent col = new CollegeStudent(102, "Anisha", "A234567", "somaiya college", "Cerf1234");
//		JobPerson job = new JobPerson(103, "Nishant", "A0987876", "NMITD", "Cerf986532", "ABC", "7845121");
	}

}
