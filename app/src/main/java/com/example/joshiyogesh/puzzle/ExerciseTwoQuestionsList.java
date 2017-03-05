package com.example.joshiyogesh.puzzle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Joshi Yogesh on 04/02/2017.
 */

public class ExerciseTwoQuestionsList extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_two_questions_list);
    }

    public void questionOne(View view) {
        Intent intent = new Intent(getApplicationContext(),ExerciseTwoQuestions.class);
        intent.putExtra("Question_index",1);
        startActivity(intent);
    }
}
