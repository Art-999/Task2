package com.example.arturmusayelyan.task2.bookieMyExample.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.arturmusayelyan.task2.R;
import com.example.arturmusayelyan.task2.bookieMyExample.activities.LobbyActivity;
import com.example.arturmusayelyan.task2.bookieMyExample.activities.MainActivity;
import com.example.arturmusayelyan.task2.bookieMyExample.adapters.WelcomePagerAdapter;

/**
 * Created by artur.musayelyan on 19/01/2018.
 */

public class WelcomeFragment extends Fragment implements View.OnClickListener {
    private ViewPager tutorialPager;
    private WelcomePagerAdapter pagerAdapter;

    public WelcomeFragment() {

    }

    public static WelcomeFragment newInstance() {
        Bundle args = new Bundle();
        WelcomeFragment fragment = new WelcomeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_welcome, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }

    private void initViews(View view) {
        view.findViewById(R.id.create_account_btn).setOnClickListener(this);
        view.findViewById(R.id.sign_in_button).setOnClickListener(this);
        tutorialPager = view.findViewById(R.id.tutorial_pager);
        TabLayout tabLayout = view.findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(tutorialPager, true);
        getTutorialSliderInfo();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.create_account_btn:
                Toast.makeText(getActivity(), "Create account button", Toast.LENGTH_SHORT).show();
                //showProgressIncludeLoader();
                startActivity(new Intent(getActivity(), LobbyActivity.class));
                ((MainActivity) getActivity()).finish();
                break;
            case R.id.sign_in_button:
                Toast.makeText(getActivity(), "Sign in button", Toast.LENGTH_SHORT).show();
                showProgressIncludeLoader();
                break;
        }
    }

    private void showProgressIncludeLoader() {
        ((MainActivity) getActivity()).showProgressIncludeLayout();
    }

    private void showCustomLoader() {
        ((MainActivity) getActivity()).showLoader();
    }

    private void endCustomLoader() {
        ((MainActivity) getActivity()).endLoader();
    }

    private void getTutorialSliderInfo() {
        //showCustomLoader();
        showProgressIncludeLoader();
        pagerAdapter = new WelcomePagerAdapter(getChildFragmentManager());
        tutorialPager.setAdapter(pagerAdapter);
    }
}
