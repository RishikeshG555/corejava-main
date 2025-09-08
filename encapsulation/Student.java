package encapsulation;

public class Student {
	private int rollno;
	private String name;
	
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
	public void setName(String name) {
		this.name=name;
	}
	public Student(int rollno, String name) {
		super();
		this.rollno=rollno;
		this.name=name;
	}
	public Student() {
		super();
	}
	public int getRollno(int num) {
		if (num==10)
			return this.rollno;
		else
			return -1;
	}
	public String getName(int num) {
		if (num==10)
			return this.name;
		else
			return "n";
	}
}
