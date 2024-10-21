package com.kodilla.parametrized_tests.homework;

public class InvalidPersonDataException extends RuntimeException {
    public InvalidPersonDataException() {
      super("Wrong person data provided");
    }
}
