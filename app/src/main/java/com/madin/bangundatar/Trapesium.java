package com.madin.bangundatar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Trapesium extends AppCompatActivity {

    private EditText inputSisiAtas, inputSisiBawah, inputTinggiTrapesium;
    private Button buttonHitungTrapesium;
    private TextView textLuasTrapesium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapesium);

        inputSisiAtas = findViewById(R.id.inputSisiAtas);
        inputSisiBawah = findViewById(R.id.inputSisiBawah);
        inputTinggiTrapesium = findViewById(R.id.inputTinggiTrapesium);
        buttonHitungTrapesium = findViewById(R.id.buttonHitungTrapesium);
        textLuasTrapesium = findViewById(R.id.textLuasTrapesium);

        buttonHitungTrapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungTrapesium();
            }
        });
    }

    private void hitungTrapesium() {
        if (inputSisiAtas.getText().toString().isEmpty() || inputSisiBawah.getText().toString().isEmpty() || inputTinggiTrapesium.getText().toString().isEmpty()) {
            Toast.makeText(this, "Masukkan semua data", Toast.LENGTH_SHORT).show();
            return;
        }

        double sisiAtas = Double.parseDouble(inputSisiAtas.getText().toString());
        double sisiBawah = Double.parseDouble(inputSisiBawah.getText().toString());
        double tinggi = Double.parseDouble(inputTinggiTrapesium.getText().toString());
        double luas = 0.5 * (sisiAtas + sisiBawah) * tinggi;

        textLuasTrapesium.setText("Luas: " + luas);
    }
}