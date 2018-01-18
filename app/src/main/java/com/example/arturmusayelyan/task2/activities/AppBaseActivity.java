package com.example.arturmusayelyan.task2.activities;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/**
 * Created by artur.musayelyan on 18/01/2018.
 */

public class AppBaseActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private ProgressBar progressBar;
    private RelativeLayout mainLayout;
    private View view;

    public void addButton(Button button) {
        this.button = button;
        this.button.setOnClickListener(this);
    }

    public void addProgressBar(ProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    public void addMainLayout(RelativeLayout mainLayout) {
        this.mainLayout = mainLayout;
    }

    public void addProgressIncludeLayout(View view) {
        this.view = view;
    }

    public void showProgressIncludeLayout() {
        view.setVisibility(View.VISIBLE);
    }

    public void hideProgressIncludeLayout() {
        view.setVisibility(View.VISIBLE);
    }

    public void showProgressBar() {
        //mainLayout.setVisibility(View.INVISIBLE);
        progressBar.setVisibility(View.VISIBLE);
    }

    public void hideProgressBar() {
        progressBar.setVisibility(View.GONE);
        mainLayout.setVisibility(View.VISIBLE);
    }

    @Override
    public void onClick(View v) {
        //showProgressBar();
        showProgressIncludeLayout();
    }
}
