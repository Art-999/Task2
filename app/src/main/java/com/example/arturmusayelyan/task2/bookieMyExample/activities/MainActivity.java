package com.example.arturmusayelyan.task2.bookieMyExample.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.arturmusayelyan.task2.R;
import com.example.arturmusayelyan.task2.bookieMyExample.fragments.WelcomeFragment;

public class MainActivity extends AppBaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button button = findViewById(R.id.progress_start_button);
//        addButton(button);
//        RelativeLayout mainLayout = findViewById(R.id.main_activity_layout);
//        addMainLayout(mainLayout);

        View view = findViewById(R.id.progress_include_layout);
        addProgressIncludeLayout(view);
        pushFragment(WelcomeFragment.newInstance(), false);
    }

}
