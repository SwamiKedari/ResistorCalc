package com.example.srk;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);


    }

    public void show(View v){
        Spinner s = findViewById(R.id.bands);
        String a = (String) s.getSelectedItem();
        if (a.equals("4 Bands")) {
            View fragmentContainer = (View) findViewById(R.id.frames);
            if (fragmentContainer != null) {
                band4 band = new band4();
                FragmentTransaction b = getSupportFragmentManager().beginTransaction();
                b.replace(R.id.frames, band);
                //b.addToBackStack(null);
                b.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                b.commit();

            }
        }
        else if (a.equals("5 Bands")) {
            View fragmentContainer = (View) findViewById(R.id.frames);
            if (fragmentContainer != null) {
                band5 band = new band5();
                FragmentTransaction b = getSupportFragmentManager().beginTransaction();
                b.replace(R.id.frames, band);
                //b.addToBackStack(null);
                b.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                b.commit();

            }
        }
        else{
            View fragmentContainer = (View) findViewById(R.id.frames);
            if (fragmentContainer != null) {
                band6 band = new band6();
                FragmentTransaction b = getSupportFragmentManager().beginTransaction();
                b.replace(R.id.frames, band);
                //b.addToBackStack(null);
                b.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                b.commit();

            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu1,menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item ){
        switch(item.getItemId()){
            case R.id.shareButton:
                Intent a=new Intent(Intent.ACTION_SEND);
                a.setType("text/plain");
                a.putExtra(Intent.EXTRA_TEXT,"Download the RCC Calculator App available on Playstore");
                Intent b=Intent.createChooser(a,"Send Message via........");
                startActivity(b);
                return true;
            case R.id.creator:
                Intent v=new Intent(this,aboutUs.class);
                startActivity(v);
            default:
                return super.onOptionsItemSelected(item);

        }
    }

    public void onBackPressed() {

        FragmentManager manager = getSupportFragmentManager();
        if (manager.getBackStackEntryCount() > 1 ) {
            // If there are back-stack entries, leave the FragmentActivity
            // implementation take care of them.

            manager.popBackStack();

        } else {
            // Otherwise, ask user if he wants to leave :)
            new AlertDialog.Builder(this)
                    .setTitle("Really Exit?")
                    .setMessage("Are you sure you want to exit?")
                    .setNegativeButton(android.R.string.no, null)
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface arg0, int arg1) {
                            MainActivity.super.onBackPressed();
                        }
                    }).create().show();
        }
    }
}