package com.example.joshiyogesh.puzzle;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ExerciseThirdQuestions extends AppCompatActivity {
    ViewPager viewPager;
    public int questionIndexReceive;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_third_questions);
        questionIndexReceive = getIntent().getIntExtra("Question_index",1);
        viewPager = (ViewPager)findViewById(R.id.pager3);
        PagerAdapterThird pagerAdapterThird = new PagerAdapterThird(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapterThird);
        viewPager.setCurrentItem(questionIndexReceive);
    }
}
