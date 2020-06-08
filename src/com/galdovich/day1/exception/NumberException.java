package com.galdovich.day1.exception;

public class NumberException extends Exception {

    private String message;

    public NumberException() {
    }

    public NumberException(String message) {
        super(message);
        this.message = message;
    }
}
