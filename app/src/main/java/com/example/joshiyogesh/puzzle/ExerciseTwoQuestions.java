package com.example.joshiyogesh.puzzle;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ExerciseTwoQuestions extends AppCompatActivity {
    ViewPager viewPager;
    public int questionIndexReceive;
    /*from exercise two questionList*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_two_questions);
        questionIndexReceive = getIntent().getIntExtra("Question_index",1);
        viewPager = (ViewPager)findViewById(R.id.pager2);
        /*TODO there is need for setting pagerAdaptertwo for this view pager*/
        PagerAdapterTwo pagerAdapterTwo = new PagerAdapterTwo(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapterTwo);
        viewPager.setCurrentItem(questionIndexReceive);
    }
}
