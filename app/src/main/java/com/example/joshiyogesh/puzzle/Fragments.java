package com.example.joshiyogesh.puzzle;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by Joshi Yogesh on 16/01/2017.
 */

public class Fragments extends Fragment {
    ImageView imageView;
    RadioButton option1,option2,option3,option4,rb;
    RadioGroup radioGroup,radioGroup1;
    Button knowHint,checkYourAnswer;
    String []answer;//to store answer linked in Strings.xml file
    String []option;//to store options of RadioButton Before split i.e in form 41,45,25,89
    View rootView;
    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container ,
                             Bundle savedInstanceState){

        int [] image_index = {R.drawable.eightypageanswer1,R.drawable.eightypageanswer8};
        Bundle bundle = getArguments();
        final int message = bundle.getInt("question_no");
        rootView = inflater.inflate(R.layout.fragments,container,false);
         /*
         getting resources from java string.xml file
         */
        answer = getResources().getStringArray(R.array.answer);
        option = getResources().getStringArray(R.array.options);
        String[] optionIndex = option[message].split(",");
        /*
        assigning java objects to their corresponding ID's of xml file
        */
        imageView = (ImageView) rootView.findViewById(R.id.imageQuestions);
        knowHint = (Button) rootView.findViewById(R.id.getHint);
        checkYourAnswer = (Button) rootView.findViewById(R.id.checkIt);
        option1 = (RadioButton) rootView.findViewById(R.id.option1);
        option2 = (RadioButton) rootView.findViewById(R.id.option2);
        option3 = (RadioButton) rootView.findViewById(R.id.option3);
        option4 = (RadioButton) rootView.findViewById(R.id.option4);
        radioGroup = (RadioGroup) rootView.findViewById(R.id.radioGroup);
        radioGroup1 = (RadioGroup) rootView.findViewById(R.id.radioGroup1);
        /*
        setting resources to fragments...
        */
        imageView.setImageResource(image_index[message]);
        option1.setText(optionIndex[0]);
        option2.setText(optionIndex[1]);
        option3.setText(optionIndex[2]);
        option4.setText(optionIndex[3]);

        radioGroup.setOnCheckedChangeListener(Listener1);
        radioGroup1.setOnCheckedChangeListener(Listener2);

        knowHint.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(getActivity()).create();
                alertDialog.setTitle("Hint");
                alertDialog.setMessage("Here message will come from strings.xml file");
                alertDialog.show();
            }
        });
        return rootView;
    }
    private RadioGroup.OnCheckedChangeListener Listener1 = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if(checkedId != -1){
                radioGroup1.setOnCheckedChangeListener(null);
                // remove the listener before clearing so we don't throw stack overflow Exception
                radioGroup1.clearCheck();//clear the second radioGroup
                radioGroup1.setOnCheckedChangeListener(Listener2);//reset the listener

                int chkId1 = radioGroup.getCheckedRadioButtonId(); //getting which radioButton has been clicked
                int chkId2 = radioGroup1.getCheckedRadioButtonId();

                int realChk = chkId1 == -1 ? chkId2 : chkId1 ;
                rb = (RadioButton) rootView.findViewById(realChk); //considering a radioButton to identify the exact id of button
            }
        }
    };

    private RadioGroup.OnCheckedChangeListener Listener2 = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if(checkedId != -1){
                radioGroup.setOnCheckedChangeListener(null);
                radioGroup.clearCheck();
                radioGroup.setOnCheckedChangeListener(Listener1);

                int chkId1 = radioGroup.getCheckedRadioButtonId();
                int chkId2 = radioGroup1.getCheckedRadioButtonId();

                int realChk = chkId1 == -1 ? chkId2 : chkId1 ;
                rb = (RadioButton) rootView.findViewById(realChk);
            }
        }
    };

}
