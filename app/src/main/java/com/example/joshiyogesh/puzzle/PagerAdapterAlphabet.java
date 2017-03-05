package com.example.joshiyogesh.puzzle;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Joshi Yogesh on 05/02/2017.
 */

public class PagerAdapterAlphabet extends FragmentPagerAdapter {
    public PagerAdapterAlphabet(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragments fragments = new Fragments();
        Bundle bundle = new Bundle();
        bundle.putInt("Question_no",position+15);
        /*here gap should be given above ... so thatv we cane select the proper image from
        * int image id in fragments .. here we are using only one fragments*/
        fragments.setArguments(bundle);
        return fragments;
    }

    @Override
    public int getCount() {
        return 2;
        /*return should be number of fragments are in swipe view or in this case images*/
    }
}
