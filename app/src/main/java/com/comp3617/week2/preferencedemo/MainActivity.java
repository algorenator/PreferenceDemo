package com.comp3617.week2.preferencedemo;

import android.app.Activity;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;


public class MainActivity extends Activity {

    static String PREF_NAME="mp";
    static String USER_NAME="user_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        if(v.getId() == R.id.bt1 ) {
            SharedPreferences sett = getSharedPreferences(PREF_NAME,0);
            SharedPreferences.Editor ed = sett.edit();
            ed.putString(USER_NAME, "jdoe");
            ed.commit();

       




        }
        if(v.getId() == R.id.bt2 ) {
            SharedPreferences sett = getSharedPreferences(PREF_NAME, 0);
            Toast.makeText(this, " Username is "+ sett.getString(USER_NAME,"na"),Toast.LENGTH_LONG).show();

        }

    }



}
