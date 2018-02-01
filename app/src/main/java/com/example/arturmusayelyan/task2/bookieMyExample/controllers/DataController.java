package com.example.arturmusayelyan.task2.bookieMyExample.controllers;

import com.example.arturmusayelyan.task2.bookieMyExample.enums.OddTypes;

/**
 * Created by artur.musayelyan on 01/02/2018.
 */

public class DataController {
    private static final DataController ourInstance = new DataController();
    private OddTypes currentOddTypes = OddTypes.DECIMAL;

    public static DataController getInstance() {
        return ourInstance;
    }

    public OddTypes getCurrentOddTypes() {
        return currentOddTypes;
    }

    public void setCurrentOddTypes(OddTypes oddTypes) {
        this.currentOddTypes = oddTypes;
    }
}
