package com.example.calculatemarkapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button btnNeededFinalNoteActivityButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnNeededFinalNoteActivityButton = (Button) findViewById(R.id.btnNeededFinalCalculator);
        btnNeededFinalNoteActivityButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity2.this, MainActivity.class));
            }
        });
    }
}