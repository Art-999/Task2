package com.example.arturmusayelyan.task2.bookieMyExample.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.arturmusayelyan.task2.R;
import com.example.arturmusayelyan.task2.bookieMyExample.activities.utils.BottomNavigatonViewHelper;
import com.example.arturmusayelyan.task2.bookieMyExample.fragments.BetSenterTabFragment;
import com.example.arturmusayelyan.task2.bookieMyExample.fragments.LobbyFragment;
import com.example.arturmusayelyan.task2.bookieMyExample.fragments.ProfileFragment;
import com.example.arturmusayelyan.task2.bookieMyExample.fragments.SettingsFragment;

/**
 * Created by artur.musayelyan on 22/01/2018.
 */

public class LobbyActivity extends AppBaseActivity {
    private BottomNavigationView navigationView;
    private FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);
        if (savedInstanceState != null) {
            findViewById(R.id.action_more).performClick();
        }

        init();
        initBottomNavigationViewClick();
    }

    private void init() {
        navigationView = findViewById(R.id.bottom_navigation);
        floatingActionButton = findViewById(R.id.floating_button);
        addBottomNavigationView(navigationView);
        addFloatingButton(floatingActionButton);
    }

    private void initBottomNavigationViewClick() {
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId()) {
                    case R.id.action_lobby:
                        Toast.makeText(getApplicationContext(), "action_lobby clicked", Toast.LENGTH_SHORT).show();
                        selectedFragment = LobbyFragment.newInstance();
                        break;
                    case R.id.action_profile:
                        Toast.makeText(getApplicationContext(), "action_profile clicked", Toast.LENGTH_SHORT).show();
                        selectedFragment = ProfileFragment.newInstance();
                        break;
                    case R.id.action_bet_center:
                        Toast.makeText(getApplicationContext(), "action_bet_center clicked", Toast.LENGTH_SHORT).show();
                        selectedFragment = BetSenterTabFragment.newInstance();
                        break;
                    case R.id.action_more:
                        Toast.makeText(getApplicationContext(), "action_more clicked", Toast.LENGTH_SHORT).show();
                        selectedFragment = SettingsFragment.newInstance();
                        break;
                }
                pushFragment(selectedFragment, false);
                return true;
            }
        });
        BottomNavigatonViewHelper.disableShiftMode(navigationView);
        pushFragment(LobbyFragment.newInstance(), false);
    }


    @Override
    public void pushFragment(Fragment fragment, boolean addToBackStack) {
        if (addToBackStack) {
            hideFloatingButton();
        } else {
            showFloatingButton();
        }
        super.pushFragment(fragment, addToBackStack);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        showFloatingButton();
        showBottomNavigationView();
    }
}
