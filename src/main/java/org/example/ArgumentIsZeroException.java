package org.example;

public class ArgumentIsZeroException extends Exception {
String message = "Cant divide by zero";

    public ArgumentIsZeroException(String all) {
    }

    @Override
    public String toString() {
        return message;
    }
}
