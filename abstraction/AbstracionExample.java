package abstraction;

abstract class bank{
	abstract void getInterestRate();
	abstract void getLoan();
}
class SBI extends bank{

	@Override
	void getInterestRate() {
		System.out.println("interest for SBI is 5.48%");
		
	}

	@Override
	void getLoan() {
		System.out.println("SBI loan");
		
	}
	
}

class ICICI extends bank{

	@Override
	void getInterestRate() {
		System.out.println("interest for ICICI is 5.48%");
		
	}

	@Override
	void getLoan() {
		System.out.println("ICICI loan");
		
	}
	
}
public class AbstracionExample {

	public static void main(String[] args) {

		new SBI().getInterestRate();
		new ICICI().getInterestRate();
		new SBI().getLoan();
		new ICICI().getLoan();
		
		bank ba=new ICICI();
		ba.getInterestRate();
		ba.getLoan();
		
		bank Hdfc =new bank() {
			void getInterestRate() {
				System.out.println("interest for SBI is 5.48%");
				
			}
			void getLoan() {
				System.out.println("SBI loan");
				
			}
		};
		Hdfc.getInterestRate();
		Hdfc.getLoan();
	}

}
