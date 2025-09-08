package exception;

public class Exampple5 {
	public static void main(String[] args) {
		System.out.println("Code before Exception");
		try {
			System.out.println(5/0);
		} catch (Exception e) {
			System.out.println("Exception handeled");
		}finally {
			System.out.println("Finally Block");
		}
		System.out.println("code after exception");
	}
}
