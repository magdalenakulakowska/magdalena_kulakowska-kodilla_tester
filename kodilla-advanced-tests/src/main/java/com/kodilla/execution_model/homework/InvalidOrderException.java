package com.kodilla.execution_model.homework;

public class InvalidOrderException extends RuntimeException {
    public InvalidOrderException() {

        super("Wrong order data provided.");
    }
}
