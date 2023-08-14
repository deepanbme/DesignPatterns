package main.java.builderDesignPattern.exceptions;

public class InvalidAgeExceptions extends RuntimeException{

    public InvalidAgeExceptions() {
    }

    public InvalidAgeExceptions(String message) {
        super(message);
    }

    public InvalidAgeExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidAgeExceptions(Throwable cause) {
        super(cause);
    }

    public InvalidAgeExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
