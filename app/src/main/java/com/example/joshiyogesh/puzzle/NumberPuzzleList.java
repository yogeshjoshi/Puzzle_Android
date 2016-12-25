package com.example.joshiyogesh.puzzle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Joshi Yogesh on 25/12/2016.
 */

public class NumberPuzzleList extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.number_puzzle);
    }
    public void exercise1(View v){
        Intent intent = new Intent(NumberPuzzleList.this,ExerciseOneQuestionList.class);
        startActivity(intent);

    }
    /*Similarly threr would be another questions*/
}
