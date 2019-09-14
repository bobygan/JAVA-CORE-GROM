package lesson20.task2.exсeptions;

public class BadRequestException extends Exception {
    public BadRequestException(String message) {
        super(message);
    }
}
