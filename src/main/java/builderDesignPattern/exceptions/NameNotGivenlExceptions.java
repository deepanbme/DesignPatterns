package main.java.builderDesignPattern.exceptions;

public class NameNotGivenlExceptions extends RuntimeException{

    public NameNotGivenlExceptions() {
    }

    public NameNotGivenlExceptions(String message) {
        super(message);
    }

    public NameNotGivenlExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public NameNotGivenlExceptions(Throwable cause) {
        super(cause);
    }

    public NameNotGivenlExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
