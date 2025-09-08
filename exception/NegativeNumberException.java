package exception;

@SuppressWarnings("serial")
public class NegativeNumberException extends RuntimeException {

	public NegativeNumberException() {
		super();
	}
	public NegativeNumberException(String message) {
		super(message);
	}
}
