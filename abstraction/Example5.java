package abstraction;

interface P{
	void methodP();
	void sum();
}
interface Q{
	void methodQ();
	void sum();
}
class R implements P,Q{

	@Override
	public void methodP() {
		System.out.println("Overriden method from P");
		
	}

	@Override
	public void methodQ() {
		System.out.println("Overriden method from Q");
		
	}

	@Override
	public void sum() {
		System.out.println("Overriden method from summ");
		
	}
	
}
public class Example5 {
	public static void main(String[] args) {
		
	}
}
