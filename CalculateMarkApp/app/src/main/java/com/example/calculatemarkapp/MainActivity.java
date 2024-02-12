package com.example.calculatemarkapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextGecmePuani,editTextVizeNotu,editTextVizeEtkisi;
    private TextView txtViewNeededFinalNot;
    private int gecmePuani,vizeNotu,vizeEtkisi;

    private Mathematic mathematic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mathematic = new Mathematic();

        editTextGecmePuani = (EditText)findViewById(R.id.editTxtGecmePuani);
        editTextVizeNotu = (EditText)findViewById(R.id.editTxtVizeNotu);
        editTextVizeEtkisi = (EditText)findViewById(R.id.editTxtVizeEtkisi);

        txtViewNeededFinalNot = (TextView)findViewById(R.id.txtViewNeededFinalNot);

    }

    public void btnCalculate(View view){
        gecmePuani = Integer.valueOf(editTextGecmePuani.getText().toString());
        vizeNotu  = Integer.valueOf(editTextVizeNotu.getText().toString());
        vizeEtkisi = Integer.valueOf(editTextVizeEtkisi.getText().toString());

        float neededFinalNote = mathematic.CalculateNeededFinalNoteToPass(gecmePuani,vizeNotu,vizeEtkisi);


        txtViewNeededFinalNot.setText(String.valueOf(neededFinalNote));

    }
}