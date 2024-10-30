package com.madin.bangundatar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Segitiga extends AppCompatActivity {

    private EditText inputAlas, inputTinggi;
    private Button buttonHitungSegitiga;
    private TextView textLuasSegitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        inputAlas = findViewById(R.id.inputAlas);
        inputTinggi = findViewById(R.id.inputTinggi);
        buttonHitungSegitiga = findViewById(R.id.buttonHitungSegitiga);
        textLuasSegitiga = findViewById(R.id.textLuasSegitiga);

        buttonHitungSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungSegitiga();
            }
        });
    }

    private void hitungSegitiga() {
        if (inputAlas.getText().toString().isEmpty() || inputTinggi.getText().toString().isEmpty()) {
            Toast.makeText(this, "Masukkan alas dan tinggi", Toast.LENGTH_SHORT).show();
            return;
        }

        double alas = Double.parseDouble(inputAlas.getText().toString());
        double tinggi = Double.parseDouble(inputTinggi.getText().toString());
        double luas = 0.5 * alas * tinggi;

        textLuasSegitiga.setText("Luas: " + luas);
    }
}
