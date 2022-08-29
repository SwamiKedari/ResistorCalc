package com.example.srk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class spinnerAdapter extends ArrayAdapter<spinnerItem> {

    public spinnerAdapter(@NonNull Context context, ArrayList<spinnerItem> s) {
        super(context, 0, s);
    }




    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    public View getCustomView(int position, @Nullable View convertView, @NonNull ViewGroup parent ){
        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.spinner,parent,false);
        }

        spinnerItem item=getItem(position);
        if(item!=null){
            String k=item.getColorNum();
            String s=item.getColorName();
            TextView t1=convertView.findViewById(R.id.spinnerNumber);
            TextView t2=convertView.findViewById(R.id.spinnerText);
            t1.setText(k);
            t2.setText(s);
            TextView t3=convertView.findViewById(R.id.spinnerColor);
           t3.setBackgroundResource(getColor(s));
        }

        return convertView;
    }


    public int getColor(String s){
        if(s.equals("Brown")){
            return R.color.brown;
        }
        else if(s.equals("Black")){
            return R.color.black;
        }
        else if(s.equals("Red")){
            return R.color.red;
        }
        else if(s.equals("Orange")){
            return R.color.orange;
        }
        else if(s.equals("Yellow")){
            return R.color.yellow;
        }
        else if(s.equals("Green")){
            return R.color.green;
        }
        else if(s.equals("Blue")){
            return R.color.blue;
        }
        else if(s.equals("Violet")){
            return R.color.violet;
        }
        else if(s.equals("Grey")){
            return R.color.grey;
        }
        else if(s.equals("Silver")){
            return R.color.silver;
        }
        else if(s.equals("Gold")){
            return R.color.gold;
        }
        else{
            return R.color.white;
        }
    }



}
