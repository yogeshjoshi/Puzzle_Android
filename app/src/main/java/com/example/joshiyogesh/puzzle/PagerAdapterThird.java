package com.example.joshiyogesh.puzzle;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Joshi Yogesh on 04/02/2017.
 */

public class PagerAdapterThird extends FragmentPagerAdapter {
    public PagerAdapterThird(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragments fragments = new Fragments();
        Bundle bundle = new Bundle();
        bundle.putInt("Question_no",position+4);
        fragments.setArguments(bundle);
        return fragments;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
