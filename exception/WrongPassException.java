package exception;

@SuppressWarnings("serial")
public class WrongPassException extends RuntimeException {

	public WrongPassException() {
		super();
	}

	public WrongPassException(String message) {
		super(message);
	}
	
}
