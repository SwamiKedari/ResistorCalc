package com.example.srk;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import java.util.*;


public class band4 extends Fragment {


    Spinner s , s1,s2,s3;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_band4,container,false);
        s = v.findViewById(R.id.band1select4);
        if(s!=null) {
            ArrayList<spinnerItem> list = new ArrayList<>();
            list.add(new spinnerItem("Brown", "1"));
            list.add(new spinnerItem("Red", "2"));
            list.add(new spinnerItem("Orange", "3"));
            list.add(new spinnerItem("Yellow", "4"));
            list.add(new spinnerItem("Green", "5"));
            list.add(new spinnerItem("Blue", "6"));
            list.add(new spinnerItem("Violet", "7"));
            list.add(new spinnerItem("Grey", "8"));
            list.add(new spinnerItem("White", "9"));
            //list.add(new spinnerItem("Red",2));

            spinnerAdapter adapter = new spinnerAdapter(inflater.getContext(), list);
            s.setAdapter(adapter);
            s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    spinnerItem sp=(spinnerItem)adapterView.getSelectedItem();
                    //View v=getView();
                    TextView t=v.findViewById(R.id.firstBand4);
                    t.setBackgroundResource(adapter.getColor(sp.getColorName()));
                    getAns(s,s1,s2,s3);
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

        }

        s1 = v.findViewById(R.id.band2select4);
        if(s1!=null) {
            ArrayList<spinnerItem> list = new ArrayList<>();
            list.add(new spinnerItem("Black","0"));
            list.add(new spinnerItem("Brown", "1"));
            list.add(new spinnerItem("Red", "2"));
            list.add(new spinnerItem("Orange", "3"));
            list.add(new spinnerItem("Yellow", "4"));
            list.add(new spinnerItem("Green", "5"));
            list.add(new spinnerItem("Blue", "6"));
            list.add(new spinnerItem("Violet", "7"));
            list.add(new spinnerItem("Grey", "8"));
            list.add(new spinnerItem("White", "9"));
            //list.add(new spinnerItem("Red",2));

            spinnerAdapter adapter = new spinnerAdapter(inflater.getContext(), list);
            s1.setAdapter(adapter);
            s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    spinnerItem sp=(spinnerItem)adapterView.getSelectedItem();
                    //View v=getView();
                    TextView t=v.findViewById(R.id.secondBand4);
                    t.setBackgroundResource(adapter.getColor(sp.getColorName()));
                    getAns(s,s1,s2,s3);
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
        }

        s2 = v.findViewById(R.id.band3select4);
        if(s2!=null) {
            ArrayList<spinnerItem> list = new ArrayList<>();
            list.add(new spinnerItem("Black","1"));
            list.add(new spinnerItem("Brown", "10"));
            list.add(new spinnerItem("Red", "100"));
            list.add(new spinnerItem("Orange", "1K"));
            list.add(new spinnerItem("Yellow", "10K"));
            list.add(new spinnerItem("Green", "100K"));
            list.add(new spinnerItem("Blue", "1M"));
            list.add(new spinnerItem("Violet", "10M"));
            list.add(new spinnerItem("Grey", "100M"));
            list.add(new spinnerItem("White", "1G"));
            //list.add(new spinnerItem("Red",2));

            spinnerAdapter adapter = new spinnerAdapter(inflater.getContext(), list);
            s2.setAdapter(adapter);
            s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    spinnerItem sp=(spinnerItem)adapterView.getSelectedItem();
                    //View v=getView();
                    TextView t=v.findViewById(R.id.thirdBand4);
                    t.setBackgroundResource(adapter.getColor(sp.getColorName()));
                    getAns(s,s1,s2,s3);
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
        }

        s3 = v.findViewById(R.id.band4select4);
        if(s3!=null) {
            ArrayList<spinnerItem> list = new ArrayList<>();
            list.add(new spinnerItem("Brown", "1%"));
            list.add(new spinnerItem("Red", "2%"));
            list.add(new spinnerItem("Orange", "0.05%"));
            list.add(new spinnerItem("Yellow", "0.02%"));
            list.add(new spinnerItem("Green", "0.5%"));
            list.add(new spinnerItem("Blue", "0.25%"));
            list.add(new spinnerItem("Violet", "0.1%"));
            list.add(new spinnerItem("Grey", "0.01%"));
            list.add(new spinnerItem("Gold", "5%"));
            list.add(new spinnerItem("Silver","10%"));
            list.add(new spinnerItem("White","20%"));
            //list.add(new spinnerItem("Red",2));

            spinnerAdapter adapter = new spinnerAdapter(inflater.getContext(), list);
            s3.setAdapter(adapter);
            s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    spinnerItem sp=(spinnerItem)adapterView.getSelectedItem();
                    //View v=getView();
                    TextView t=v.findViewById(R.id.fourthBand4);
                    t.setBackgroundResource(adapter.getColor(sp.getColorName()));
                    getAns(s,s1,s2,s3);
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
        }



        return v;
    }

    public void getAns(Spinner s ,Spinner s1,Spinner s1k , Spinner s2){
        spinnerItem first=(spinnerItem)s.getSelectedItem();
        spinnerItem second=(spinnerItem)s1.getSelectedItem();
        spinnerItem third=(spinnerItem)s1k.getSelectedItem();
        spinnerItem fourth=(spinnerItem)s2.getSelectedItem();

        String firstDigit=first.getColorNum();
        String secondDigit=second.getColorNum();
        String thirdDigit=third.getColorNum();
        String fourthDigit=fourth.getColorNum();
        TextView a =getView().findViewById(R.id.answer4);
        a.setText(getAns(firstDigit,secondDigit,thirdDigit,fourthDigit));



    }

    public String getAns(String s,String s1,String s2,String s3){
        int a1=Integer.parseInt(s);
        int a2=Integer.parseInt(s1);
        String ans=null;
        String mul=spinnerItem.getMultiplier(s2);
        try{
            float f=Float.parseFloat(mul);
            int h=a1*10+a2;
            if(f>=1){
                h=h*(int)f;
            }
            ans=String.valueOf(h)+getString(R.string.ohm)+" "+getString(R.string.plusMinus)+s3;
        }
        catch (Exception E){
            if(s2.length()>1){
                float f1=Float.parseFloat(s2.substring(0,s2.length()-1));
                int h=a1*10+a2;
                if(f1>=1){
                    h=h*(int)f1;
                }
                //f1=f1*h;
                if(h>=1000){
                    char c=s2.charAt(s2.length()-1);
                    float f2=h/1000.f;
                    if(c=='K'){
                        ans=String.valueOf(f2)+"M"+getString(R.string.ohm)+" "+getString(R.string.plusMinus)+s3;
                    }
                    else{
                        ans=String.valueOf(f2)+"G"+getString(R.string.ohm)+" "+getString(R.string.plusMinus)+s3;
                    }
                }
                else {
                    ans = String.valueOf(h) + s2.charAt(s2.length() - 1) + getString(R.string.ohm) + " " + getString(R.string.plusMinus) + s3;
                }
            }
        }

        return ans;


    }


}