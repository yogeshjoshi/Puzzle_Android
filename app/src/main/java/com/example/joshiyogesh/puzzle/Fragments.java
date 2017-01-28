package com.example.joshiyogesh.puzzle;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Joshi Yogesh on 16/01/2017.
 */

public class Fragments extends Fragment {
    ImageView imageView;
    RadioButton option1 , option2 ,option3;
    RadioGroup radioGroup;
    Button knowHint,knowAnswer,knowCheckYourAnswer;
    String []answer ;
    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container ,
                             Bundle savedInstanceState){

        int [] image_index = {R.drawable.eightypageanswer1,R.drawable.eightypageanswer8};
        Bundle bundle = getArguments();
        final int message = bundle.getInt("question_no");
        View rootView = inflater.inflate(R.layout.fragments,container,false);
        /*assigning java objects to their corresponding ID's of xml file*/
        answer = getResources().getStringArray(R.array.answer);
        imageView = (ImageView) rootView.findViewById(R.id.imageQuestions);
        knowHint = (Button) rootView.findViewById(R.id.getHint);
        knowAnswer = (Button) rootView.findViewById(R.id.getAnswer);
        knowCheckYourAnswer = (Button) rootView.findViewById(R.id.checkIt);
        option1 = (RadioButton) rootView.findViewById(R.id.option1);
        option2 = (RadioButton) rootView.findViewById(R.id.option2);
        option3 = (RadioButton) rootView.findViewById(R.id.option3);
        radioGroup = (RadioGroup) rootView.findViewById(R.id.radioGroup);
        //setting resources to fragments...
        imageView.setImageResource(image_index[message]);
        knowAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),answer[message],Toast.LENGTH_LONG).show();
            }
        });
        return rootView;
    }
}
