package exception;

@SuppressWarnings("serial")
public class IdNotFoundException extends Exception {

	public IdNotFoundException() {
		super();
	}

	public IdNotFoundException(String message) {
		super(message);
	}

}
