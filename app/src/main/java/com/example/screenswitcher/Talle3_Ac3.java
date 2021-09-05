package com.example.screenswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class Talle3_Ac3 extends AppCompatActivity {

    Button calculateBtn;

    EditText textPP1, textPP2, textQ, textP1, textP2;
    float PP1, PP2, Q, P1, P2;
    float finalResult;
    String finalResultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talle3_ac3);

        calculateBtn = findViewById(R.id.calculateButton);
        textPP1 = findViewById(R.id.textSpacePP1);
        textPP2 = findViewById(R.id.textSpacePP2);
        textQ = findViewById(R.id.textSpaceQuiz);
        textP1 = findViewById(R.id.textSpaceP1);
        textP2 = findViewById(R.id.textSpaceP2);

        calculateBtn.setOnClickListener(
                (view) ->
                {
                    storeVarsAndCalculate();
                    moveToNextScreen();
                }
        );
    }

    public void moveToNextScreen()
    {

    }

    public void storeVarsAndCalculate()
    {
        PP1 = Float.parseFloat(textPP1.getText().toString());
        PP2 = Float.parseFloat(textPP2.getText().toString());
        Q = Float.parseFloat(textQ.getText().toString());
        P1 = Float.parseFloat(textP1.getText().toString());
        P2 = Float.parseFloat(textP2.getText().toString());

        finalResult = (PP1 + PP2 + Q + P1 + P2)/5;

        finalResultText = String.valueOf(finalResult);

        Log.d("tag", finalResultText);

        Intent switchActivity = new Intent(this, taller3_ac4.class);
        switchActivity.putExtra("nota final", finalResultText);
        startActivity(switchActivity);
    }

}