package com.example.joshiyogesh.puzzle;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Joshi Yogesh on 16/01/2017.
 */

public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        //switch case statement to show the fragments
        //here i'll have to pass the image id as well to show that
        //in fragments
       /*  switch (position){
            case 0:
                return new Fragments();
            case 1:
                return new Fragments();
            default:
                return new Fragments();
        }*/
//      position = new ExerciseOneQuestions().questionIndexReceive;
        /*position variable can not changed*/
        Fragments fragments = new Fragments();
        Bundle bundle = new Bundle();
        bundle.putInt("question_no",position);
        fragments.setArguments(bundle);
        return fragments;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
