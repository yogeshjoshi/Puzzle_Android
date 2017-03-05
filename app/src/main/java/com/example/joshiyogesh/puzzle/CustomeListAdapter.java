package com.example.joshiyogesh.puzzle;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joshi Yogesh on 12/02/2017.
 */

public class CustomeListAdapter extends ArrayAdapter {
    private List list = new ArrayList();
    public CustomeListAdapter(Context context, int resource) {
        super(context, resource);
    }
    public void add(ListviewClass object) {
        list.add(object);
        super.add(object);
    }
    static class ImgHolder{
       public ImageView image;
       public TextView text;
    }
    @Override
    public int getCount() {
        return this.list.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        row = convertView;
        ImgHolder holder;
        if(convertView == null){
        LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        row = inflater.inflate(R.layout.list_row,parent,false);
        holder = new ImgHolder();
        holder.image = (ImageView) row.findViewById(R.id.country_icon);
        holder.text = (TextView) row.findViewById(R.id.country_name);
        row.setTag(holder);
        }
        else {
            holder =(ImgHolder) row.getTag();
        }
        ListviewClass listviewClass = (ListviewClass)getItem(position);
        holder.image.setImageResource(listviewClass.getResoureces_image());
        holder.text.setText(listviewClass.getCountry_name());
        return row;  }
}
