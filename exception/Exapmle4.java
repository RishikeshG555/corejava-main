package exception;

public class Exapmle4 {
	public static void main(String[] args) {
		try {
			String name="Zalak";
			System.out.println(name.length());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("code after exception");
	}
}