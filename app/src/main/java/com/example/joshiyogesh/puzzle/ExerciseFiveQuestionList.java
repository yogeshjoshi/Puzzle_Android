package com.example.joshiyogesh.puzzle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ExerciseFiveQuestionList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_five_question_list);
    }

    public void questionOne(View view) {
        Intent intent = new Intent(getApplicationContext(),ExerciseOneQuestions.class);
        intent.putExtra("Question_index",1);
        startActivity(intent);
    }
}
