package main.java.builderDesignPattern.exceptions;

public class InvalidSchoolPassOutYearExceptions extends RuntimeException{

    public InvalidSchoolPassOutYearExceptions() {
    }

    public InvalidSchoolPassOutYearExceptions(String message) {
        super(message);
    }

    public InvalidSchoolPassOutYearExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidSchoolPassOutYearExceptions(Throwable cause) {
        super(cause);
    }

    public InvalidSchoolPassOutYearExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
