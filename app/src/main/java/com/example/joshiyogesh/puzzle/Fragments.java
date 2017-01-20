package com.example.joshiyogesh.puzzle;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Joshi Yogesh on 16/01/2017.
 */

public class Fragments extends Fragment {
    ImageView imageView;
    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container ,
                             Bundle savedInstanceState){

        int [] image_index = {R.drawable.eightypageanswer1,R.drawable.eightypageanswer8};
        Bundle bundle = getArguments();
        int message = bundle.getInt("question_no");
        View rootView = inflater.inflate(R.layout.fragments,container,false);
        imageView = (ImageView) rootView.findViewById(R.id.imageQuestions);
        imageView.setImageResource(image_index[message]);
        return rootView;
    }
}
