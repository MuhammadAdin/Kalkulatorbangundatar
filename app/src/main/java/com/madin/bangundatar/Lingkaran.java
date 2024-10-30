package com.madin.bangundatar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Lingkaran extends AppCompatActivity {

    private EditText inputJariJari;
    private Button buttonHitungLingkaran;
    private TextView textLuasLingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        inputJariJari = findViewById(R.id.inputJariJari);
        buttonHitungLingkaran = findViewById(R.id.buttonHitungLingkaran);
        textLuasLingkaran = findViewById(R.id.textLuasLingkaran);

        buttonHitungLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLingkaran();
            }
        });
    }

    private void hitungLingkaran() {
        if (inputJariJari.getText().toString().isEmpty()) {
            Toast.makeText(this, "Masukkan jari-jari", Toast.LENGTH_SHORT).show();
            return;
        }

        double jariJari = Double.parseDouble(inputJariJari.getText().toString());
        double luas = Math.PI * jariJari * jariJari;

        textLuasLingkaran.setText("Luas: " + luas);
    }
}