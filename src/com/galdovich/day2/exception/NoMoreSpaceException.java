package com.galdovich.day2.exception;

public class NoMoreSpaceException extends Exception {

    public NoMoreSpaceException() {
    }

    public NoMoreSpaceException(String message) {
        super(message);
    }
}
