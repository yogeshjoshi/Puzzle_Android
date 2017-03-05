package com.example.joshiyogesh.puzzle;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ExerciseFourthQuestions extends AppCompatActivity {
    ViewPager viewPager;
    public int questionIndexReceive;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_fourth_questions);
        viewPager = (ViewPager)findViewById(R.id.pager4);
        questionIndexReceive = getIntent().getIntExtra("Question_index",1);
        PagerAdapterFourth pagerAdapterFourth = new PagerAdapterFourth(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapterFourth);
        viewPager.setCurrentItem(questionIndexReceive);
    }
}
