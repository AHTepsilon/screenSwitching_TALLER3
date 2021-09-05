package com.example.screenswitcher;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Talle3_Ac2 extends AppCompatActivity {

    Button configBtn, continueBtn;
    private ConstraintLayout ConstraintLayout;
    EditText nameSpace;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talle3_ac2);

        configBtn = findViewById(R.id.configButton);
        continueBtn = findViewById(R.id.continueButton);
        nameSpace = findViewById(R.id.nameTextSpace);

        ConstraintLayout = findViewById(R.id.layout2);

        configBtn.setOnClickListener(
                (view) ->
                {
                    moveToPreviousScreen();
                }
        );

        continueBtn.setOnClickListener(
                (view) ->
                {
                    name = nameSpace.getText().toString();
                    Intent switchActivity = new Intent(this, Talle3_Ac3.class);
                    switchActivity.putExtra("nameSave", name);
                    //Log.d("tag", name);
                    startActivity(switchActivity);
                }
        );
    }

    public void moveToNextScreen()
    {

    }

    public void moveToPreviousScreen()
    {
        Intent switchActivityPrevious = new Intent(this, MainActivity.class);
        startActivity(switchActivityPrevious);
    }

    protected void onResume()
    {
        super.onResume();

        SharedPreferences data = getSharedPreferences("data", MODE_PRIVATE);
        String backGround = data.getString("background", "#FFFFFF");
        ConstraintLayout.setBackgroundColor(Color.parseColor(backGround));

    }
}