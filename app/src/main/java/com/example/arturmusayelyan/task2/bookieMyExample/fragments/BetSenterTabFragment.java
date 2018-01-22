package com.example.arturmusayelyan.task2.bookieMyExample.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.arturmusayelyan.task2.R;

/**
 * Created by artur.musayelyan on 22/01/2018.
 */

public class BetSenterTabFragment extends Fragment {
    public BetSenterTabFragment() {

    }

    public static BetSenterTabFragment newInstance() {
        Bundle args = new Bundle();
        BetSenterTabFragment fragment = new BetSenterTabFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_betsenter, container, false);
    }
}
