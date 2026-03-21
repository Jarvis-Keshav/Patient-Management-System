package com.pm.patientservice.exception;

public class EmailAlreadyExsistsException extends RuntimeException {
    public EmailAlreadyExsistsException(String message) {
        super(message);
    }
}
