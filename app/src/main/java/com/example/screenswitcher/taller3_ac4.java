package com.example.screenswitcher;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class taller3_ac4 extends AppCompatActivity {

    Button returnBtn;

    TextView yourGrade, gradeArgument;
    String finalGrade, testString;
    private ConstraintLayout ConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taller3_ac4);

        returnBtn = findViewById(R.id.returnButton);
        yourGrade = findViewById(R.id.gradeTextView);
        gradeArgument = (TextView)findViewById(R.id.textView8);

        ConstraintLayout = findViewById(R.id.layout4);

        testString = "test";

        returnBtn.setOnClickListener(
                (view) ->
                {
                    moveToCalculateScreen();
                }
        );

        Intent nameInt = getIntent();
        String userName = nameInt.getStringExtra("nameSaver");

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

    protected void onResume()
    {
        super.onResume();

        SharedPreferences data = getSharedPreferences("data", MODE_PRIVATE);
        String backGround = data.getString("background", "#FFFFFF");
        ConstraintLayout.setBackgroundColor(Color.parseColor(backGround));

    }
}