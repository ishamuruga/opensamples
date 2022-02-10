package com.mycompany.mybankapi.exceptions;

public class UnderAgeStudentException extends Exception {

    public UnderAgeStudentException(String message, Exception ex) {
        super(message, ex);
    }

    public UnderAgeStudentException(String message) {
        super(message);
    }

}
