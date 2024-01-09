package org.example;

public class FileNotFoundException extends RuntimeException {
    public FileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
