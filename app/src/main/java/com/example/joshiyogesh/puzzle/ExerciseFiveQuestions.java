package com.example.joshiyogesh.puzzle;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ExerciseFiveQuestions extends AppCompatActivity {
    ViewPager viewPager;
    public int questionIndexReceive;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_five_questions);
        viewPager = (ViewPager)findViewById(R.id.pager5);
        questionIndexReceive = getIntent().getIntExtra("Question_index",1);
        PagerAdapterFive pagerAdapterFive = new PagerAdapterFive(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapterFive);
        viewPager.setCurrentItem(questionIndexReceive);
    }
}
