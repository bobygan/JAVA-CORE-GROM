package lesson20.task2.exсeption;

public class BadRequestException extends Exception {
    public BadRequestException(String message) {
        super(message);
    }
}
