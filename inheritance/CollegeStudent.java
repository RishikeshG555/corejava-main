package inheritance;

public class CollegeStudent extends SchoolStudent {

	String collegeName;
	String collegeCertificate;
	
	public CollegeStudent(int id, String name, String sscCertificate, String collegeName, String collegeCertificate) {
		super(id, name, sscCertificate);
		this.collegeName = collegeName;
		this.collegeCertificate = collegeCertificate;
	}
	
	public CollegeStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
}