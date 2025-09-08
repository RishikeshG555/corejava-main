package inheritance;

public class JobPerson extends CollegeStudent {

	String company;
	String offerLetterId;
	
	public JobPerson(int id, String name, String sscCertificate, String collegeName, String collegeCertificate,
			String company, String offerLetterId) {
		super(id, name, sscCertificate, collegeName, collegeCertificate);
		this.company = company;
		this.offerLetterId = offerLetterId;
	}
	
	public JobPerson() {
		super();
	}
}
