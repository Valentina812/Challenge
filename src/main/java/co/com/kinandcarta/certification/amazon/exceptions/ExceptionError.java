package co.com.kinandcarta.certification.amazon.exceptions;

public class ExceptionError extends AssertionError{
    public ExceptionError(String message, Throwable cause) {
        super(message, cause);
    }
}
