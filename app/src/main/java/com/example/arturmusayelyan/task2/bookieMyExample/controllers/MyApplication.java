package com.example.arturmusayelyan.task2.bookieMyExample.controllers;

import android.content.Context;
import android.content.res.Configuration;

import com.example.arturmusayelyan.task2.bookieMyExample.activities.utils.SaveAppSettings;

import java.util.Locale;

/**
 * Created by artur.musayelyan on 01/02/2018.
 */

public class MyApplication extends android.app.Application {
    private static Locale locale = null;

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(locale!=null){
            newConfig.locale=locale;
            Locale.setDefault(locale);
            getBaseContext().getResources().updateConfiguration(newConfig,getBaseContext().getResources().getDisplayMetrics());
        }
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }
    public static void setLocale(Locale loc){
        locale=loc;
    }

    @Override
    public void onCreate() {
        super.onCreate();
   //Foreground.init(this);----?

        //Init Settings
        SaveAppSettings.readAppSetingsInfo(getApplicationContext());
    }
}
