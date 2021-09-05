package com.example.screenswitcher;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button switchScreenBlue, switchScreenWhite, switchScreenBlack;
    //private ConstraintLayout ConstraintLayout;
    String whiteColor, blueColor, blackColor;
    View view;

    private int layoutId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("tag", getLayoutName());

        view = this.getWindow().getDecorView();

        switchScreenBlue = findViewById(R.id.blueButton);
        switchScreenWhite = findViewById(R.id.whiteButton);
        switchScreenBlack = findViewById(R.id.blackButton);

        //ConstraintLayout = findViewById(R.id.ConstraintLayout);

        whiteColor = "#FFFFFF";
        blueColor = "#8881E3";
        blackColor = "#6B6B6B";

        // SharedPreferences data = getSharedPreferences("data", MODE_PRIVATE);

        switchScreenBlue.setOnClickListener(
                (view)->
                {
                    /*data.edit().putString("background", blueColor).apply();
                    finish();*/
                    moveToNextScreen();
                }


        );
        switchScreenWhite.setOnClickListener(
                (view)->
                {
                    /*data.edit().putString("background", whiteColor).apply();
                    finish();*/
                    moveToNextScreen();
                }
        );
        switchScreenBlack.setOnClickListener(
                (view)->
                {
                    /*data.edit().putString("background", blackColor).apply();
                    finish();*/
                    moveToNextScreen();
                }
        );

    }

    public void setContentView(int layoutResID)
    {
        this.layoutId = layoutResID;
        super.setContentView(layoutResID);
    }

    protected String getLayoutName()
    {
        return getResources().getResourceEntryName(this.layoutId);
    }

    public void moveToNextScreen()
    {
        Intent switchActivity = new Intent(this, Talle3_Ac2.class);
        startActivity(switchActivity);
    }

   /* protected void onResume()
    {
        super.onResume();

        SharedPreferences data = getSharedPreferences("data", MODE_PRIVATE);
        String backGround = data.getString("background", "#FFFFFF");
        ConstraintLayout.setBackgroundColor(Color.parseColor(backGround));

    }*/
}