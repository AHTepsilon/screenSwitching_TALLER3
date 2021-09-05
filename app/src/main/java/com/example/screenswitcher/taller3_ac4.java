package com.example.screenswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class taller3_ac4 extends AppCompatActivity {

    Button returnBtn;

    TextView yourGrade, gradeArgument;
    String finalGrade, testString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taller3_ac4);

        returnBtn = findViewById(R.id.returnButton);
        yourGrade = findViewById(R.id.gradeTextView);
        gradeArgument = (TextView)findViewById(R.id.textView8);

        testString = "test";

        returnBtn.setOnClickListener(
                (view) ->
                {
                    moveToCalculateScreen();
                }
        );

        Intent nameInt = getIntent();
        String userName = nameInt.getStringExtra("nameSave");

        gradeArgument.setText("Hola, " + userName + ", tu nota es:");

        Intent i = getIntent();
        finalGrade = i.getStringExtra("nota final");

        yourGrade.setText(finalGrade);

        //Log.d("tag", testString);
    }

    public void calculate()
    {

    }

    public void moveToCalculateScreen()
    {
        Intent switchActivity = new Intent(this, Talle3_Ac2.class);
        startActivity(switchActivity);
    }
}