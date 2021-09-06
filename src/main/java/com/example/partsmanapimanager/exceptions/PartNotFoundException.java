package com.example.partsmanapimanager.exceptions;

public class PartNotFoundException extends RuntimeException{
    public PartNotFoundException(String message) {
        super(message);
    }
}
