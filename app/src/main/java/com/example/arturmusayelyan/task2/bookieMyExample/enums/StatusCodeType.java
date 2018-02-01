package com.example.arturmusayelyan.task2.bookieMyExample.enums;

/**
 * Created by artur.musayelyan on 01/02/2018.
 */

public enum StatusCodeType {
    OK(0),
    DEFAULT(1),
    EMAIL_NOT_VERIFIED(2),
    TOKEN_EXPIRED(3);

    private final int statusCode;

    StatusCodeType(int statusCode) {
        this.statusCode = statusCode;
    }
    public int getStatusCode(){
        return statusCode;
    }
}
