package main.java.builderDesignPattern.exceptions;

public class InvalidEmailExceptions extends RuntimeException{

    public InvalidEmailExceptions() {
    }

    public InvalidEmailExceptions(String message) {
        super(message);
    }

    public InvalidEmailExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidEmailExceptions(Throwable cause) {
        super(cause);
    }

    public InvalidEmailExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
