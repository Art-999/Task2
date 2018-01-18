package com.example.arturmusayelyan.task2.activities;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by artur.musayelyan on 18/01/2018.
 */

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        checkUpdate();
        checkUsersIsLogin();
    }

    public void checkUpdate() {
        int version = 0;
        PackageInfo packageInfo = null;
        try {
            packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        if (packageInfo != null) {
            version = packageInfo.versionCode;
        }
        Log.d("Art", version + " ");
    }

    public void checkUsersIsLogin() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SystemClock.sleep(3000);
                startMainActivity();
            }
        }).start();
    }

    public void startMainActivity() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
