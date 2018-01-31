package com.example.arturmusayelyan.task2.bookieMyExample.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.arturmusayelyan.task2.R;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener {
    private Button successButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        successButton = findViewById(R.id.success_button);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.success_button:

                break;
        }
    }
}
