package ru.sem4;

public class ValidationError {

    private String value;

    public ValidationError(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
