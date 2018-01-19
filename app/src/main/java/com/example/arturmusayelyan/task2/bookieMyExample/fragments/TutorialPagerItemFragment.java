package com.example.arturmusayelyan.task2.bookieMyExample.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.arturmusayelyan.task2.R;

/**
 * Created by artur.musayelyan on 19/01/2018.
 */

public class TutorialPagerItemFragment extends Fragment {
    public TutorialPagerItemFragment() {

    }

    public static TutorialPagerItemFragment newInstance(int position) {
        Bundle args = new Bundle();
        args.putInt("color",position);
        TutorialPagerItemFragment fragment = new TutorialPagerItemFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_tutorial_pager_item, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.image_view_pager_item).setBackgroundColor(ContextCompat.getColor(getActivity(),getArguments().getInt("color")));
    }
}
