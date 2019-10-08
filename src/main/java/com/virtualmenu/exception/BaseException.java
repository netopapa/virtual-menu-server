package com.virtualmenu.exception;

public class BaseException extends RuntimeException {

    private final String[] args;

    public BaseException(String message, String... args) {
        super(message);
        this.args = args;
    }

    public BaseException(String message, Throwable cause, String... args) {
        super(message, cause);
        this.args = args;
    }
}
