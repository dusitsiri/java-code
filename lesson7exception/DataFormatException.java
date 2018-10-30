package lesson7exception;

public class DataFormatException extends RuntimeException {
	
	public DataFormatException() { }
	public DataFormatException(String message) {
		super(message);
	}

}
