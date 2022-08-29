package com.example.srk;

public class spinnerItem {
    private String colorName;
    private String colorNum;

    public spinnerItem(String s,String c){
        colorName=s;
        colorNum=c;
    }


    public String getColorName(){
        return colorName;
    }

    public String getColorNum(){
        return colorNum;
    }


    public static String getMultiplier(String k){
        int h=k.length();
        if(h==1){
            return "1";
        }
        else if(h==2){
            if(k.charAt(h-1)=='K'){
                return "K";
            }
            else if(k.charAt(h-1)=='M'){
                return "M";
            }
            else if(k.charAt(h-1)=='G'){
                return "G";
            }
            else{
                return "10";
            }
        }
        else if(h==3){
            return k;
        }
        else{
            if(k.charAt(h-1)=='1'){
                return "0.01";
            }
            return k;
        }
    }
}
