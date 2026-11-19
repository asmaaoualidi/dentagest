package com.dentagest.exceptions;

public class FinanceException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public FinanceException(String message) {
        super(message);
    }

    public FinanceException(String message, Throwable cause) {
        super(message, cause);
    }
}