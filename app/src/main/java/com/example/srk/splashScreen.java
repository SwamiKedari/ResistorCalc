package com.example.srk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();

        Thread thread =new Thread(){
            @Override
            public void run() {
                try{
                    sleep(2000);

                }
                catch(Exception E){
                    E.printStackTrace();

                }
                finally{
                    Intent i=new Intent(splashScreen.this,MainActivity.class);
                    startActivity(i);
                    finish();

                }
                super.run();
            }
        };
        thread.start();
    }
}