package com.example.arturmusayelyan.task2.bookieMyExample.activities.utils;

import android.content.Context;

import com.example.arturmusayelyan.task2.bookieMyExample.controllers.DataController;
import com.example.arturmusayelyan.task2.bookieMyExample.enums.OddTypes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by artur.musayelyan on 01/02/2018.
 */

public class SaveAppSettings {

    public static void saveAppSettingsInfo(OddTypes oddType, Context context) {
        FileOutputStream outputStream;
        String fileName = "Odds_SettingsFile";

        try {
            File file = new File(context.getFilesDir(), fileName);
            outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(oddType);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readAppSetingsInfo(Context context){
        String fileName = "Odds_SettingsFile";
        FileInputStream inputStream;
        try {
            inputStream=new FileInputStream(context.getFilesDir()+"/"+fileName);
            ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
            DataController.getInstance().setCurrentOddTypes((OddTypes) objectInputStream.readObject());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
