package com.example.arturmusayelyan.task2.bookieMyExample.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.arturmusayelyan.task2.bookieMyExample.fragments.TutorialPagerItemFragment;

/**
 * Created by artur.musayelyan on 19/01/2018.
 */

public class WelcomePagerAdapter extends FragmentStatePagerAdapter {
    private int colorArray[] = {android.R.color.holo_red_light, android.R.color.holo_blue_bright, android.R.color.holo_green_light, android.R.color.holo_purple, android.R.color.holo_orange_light};

    public WelcomePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return TutorialPagerItemFragment.newInstance(colorArray[position]);
    }

    @Override
    public int getCount() {
        return 5;
    }
}
