package com.example.joshiyogesh.puzzle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Settings extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        String country_names[] = {"Australia","Brazil","France","India","Pakistan","Russia"};
        int country_icon[] ={R.drawable.australia_round_icon_64,R.drawable.brazil_round_icon_64,R.drawable.france_round_icon_64
        ,R.drawable.india_round_icon_64,R.drawable.pakistan_round_icon_64,R.drawable.russia_round_icon_64};

        listView = (ListView)findViewById(R.id.listView);
        CustomeListAdapter adapter = new CustomeListAdapter(getApplicationContext(),R.layout.list_row);
        listView.setAdapter(adapter);
        int count =0;
        for(String names : country_names){
            ListviewClass listviewClass = new ListviewClass(country_icon[count],names);
            adapter.add(listviewClass);
            count++;
        }
    }
}
