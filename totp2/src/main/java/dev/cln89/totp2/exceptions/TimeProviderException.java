package dev.cln89.totp2.exceptions;

public class TimeProviderException extends RuntimeException {
    public TimeProviderException(String message) {
        super(message);
    }
    public TimeProviderException(String message, Throwable cause) {
        super(message, cause);
    }
}
