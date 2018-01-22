package com.example.arturmusayelyan.task2.bookieMyExample.activities;

import android.os.SystemClock;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.example.arturmusayelyan.task2.R;
import com.example.arturmusayelyan.task2.bookieMyExample.views.Loader;

/**
 * Created by artur.musayelyan on 18/01/2018.
 */

public class AppBaseActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private ProgressBar progressBar;
    private RelativeLayout mainLayout;
    private View view;
    private BottomNavigationView bottomNavigationView;
    private FloatingActionButton floatingActionButton;
    private Loader loader;

    public void addLoader(Loader loader) {
        this.loader = loader;
    }

    public void showLoader() {
        loader.start();
        loader.setVisibility(View.VISIBLE);
    }

    public void endLoader() {
        loader.end();
        loader.setVisibility(View.GONE);
    }

    public void addButton(Button button) {
        this.button = button;
        this.button.setOnClickListener(this);
    }

    public void addMainLayout(RelativeLayout mainLayout) {
        this.mainLayout = mainLayout;
    }

    public void addProgressIncludeLayout(View view) {
        this.view = view;
    }

    public void showProgressIncludeLayout() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                view.post(new Runnable() {
                    @Override
                    public void run() {
                        view.setVisibility(View.VISIBLE);
                    }
                });
                SystemClock.sleep(2000);
                hideProgressIncludeLayout();
            }
        });
        thread.start();
    }

    public void hideProgressIncludeLayout() {
        view.post(new Runnable() {
            @Override
            public void run() {
                view.setVisibility(View.GONE);
            }
        });
    }


    @Override
    public void onClick(View v) {
        //showProgressBar();
        showProgressIncludeLayout();
    }

    public void pushFragment(Fragment fragment, boolean addToBackStack) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if (addToBackStack) {
            transaction.add(R.id.container, fragment);
            transaction.addToBackStack(fragment.getClass().getSimpleName());
        } else {
            transaction.replace(R.id.container, fragment);
        }
        transaction.commit();
    }

    public void addBottomNavigationView(BottomNavigationView bottomNavigationView) {
        this.bottomNavigationView = bottomNavigationView;
    }

    public void showBottomNavigationView() {
        if (bottomNavigationView != null) {
            bottomNavigationView.setVisibility(View.VISIBLE);
        }
    }

    public void hideBottomNavigationView() {
        if (bottomNavigationView != null) {
            bottomNavigationView.setVisibility(View.GONE);
        }
    }

    public void addFloatingButton(FloatingActionButton floatingActionButton) {
        this.floatingActionButton = floatingActionButton;
    }

    public void showFloatingButton() {
        if (floatingActionButton != null) {
            floatingActionButton.setVisibility(View.VISIBLE);
        }
    }

    public void hideFloatingButton() {
        if (floatingActionButton != null) {
            floatingActionButton.setVisibility(View.GONE);
        }
    }
}
