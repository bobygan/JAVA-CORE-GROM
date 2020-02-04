package lesson36.exeption;

public class BadRequestException extends Exception {
    public BadRequestException(String message) {
        super(message);
    }
}
