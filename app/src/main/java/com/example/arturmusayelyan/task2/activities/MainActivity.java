package com.example.arturmusayelyan.task2.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.arturmusayelyan.task2.R;

public class MainActivity extends AppBaseActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = button = findViewById(R.id.progress_start_button);
        addButton(button);
//        ProgressBar progressBar = progressBar = findViewById(R.id.progress_bar);
//        addProgressBar(progressBar);
        View view=findViewById(R.id.progress_include_layout);
        addProgressIncludeLayout(view);
        RelativeLayout mainLayout = findViewById(R.id.main_activity_layout);
        addMainLayout(mainLayout);
    }

}
