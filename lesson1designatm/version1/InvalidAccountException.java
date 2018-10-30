package lesson1designatm.version1;

public class InvalidAccountException extends Exception {
    public InvalidAccountException() { }
    public InvalidAccountException(String reason) {
        super(reason);
    }
}
