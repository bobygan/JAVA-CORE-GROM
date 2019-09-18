package lesson22.homework2.exсeptions;

public class BadRequestException extends Exception {
    public BadRequestException(String message) {
        super(message);
    }
}
