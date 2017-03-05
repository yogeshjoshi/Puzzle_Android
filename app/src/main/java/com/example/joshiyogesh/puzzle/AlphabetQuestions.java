package com.example.joshiyogesh.puzzle;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AlphabetQuestions extends AppCompatActivity {
    ViewPager viewPager;
    public int questionIndexReceive;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_questions);
        viewPager = (ViewPager)findViewById(R.id.pagerAlphabet);
        questionIndexReceive = getIntent().getIntExtra("Question_index",1);
        PagerAdapterAlphabet pagerAdapterAlphabet = new PagerAdapterAlphabet(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapterAlphabet);
        viewPager.setCurrentItem(questionIndexReceive);
    }
}
