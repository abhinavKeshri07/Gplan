package com.abhinavkeshri07.gplan;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        {

        }
        else
        {

        }
        Intent intent = new Intent(this, navigation.class);
        startActivity(intent);

    }
}
