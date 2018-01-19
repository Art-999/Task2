package com.example.arturmusayelyan.task2.bookieMyExample.network;

/**
 * Created by artur.musayelyan on 19/01/2018.
 */

public enum EndpointTypes {
    USER("user"),
    SPORT("sport"),
    DICTIONARY("Dictionary"),
    GAME("game"),
    Bet("bet"),
    COMMONFUNCTIONS("CommonFunctions");


    private final String name;

    EndpointTypes(String s) {
        name = s;
    }

    public boolean equalsName(String otherName){

        return otherName != null && name.equals(otherName);

    }
    public String toString(){
        return name;
    }
}
