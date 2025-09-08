package polymorphism;

class bank{
	void getInterestRate() {
		System.out.println("General interest rate is 5%");
	}
}

class SBI extends bank{
	void getInterestRate() {
		super.getInterestRate();
		System.out.println("Interest rate for SBI is 5%");
	}
}
public class Methodveriding {

	public static void main(String[] args) {

		new SBI().getInterestRate();
		new bank().getInterestRate();
	}

}
