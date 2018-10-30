package lesson1designatm.version2;

public class InvalidAccountException extends Exception {
    public InvalidAccountException() { }
    public InvalidAccountException(String reason) {
        super(reason);
    }
}
