package com.madin.bangundatar;



import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Persegi extends AppCompatActivity {

    private EditText inputSisi;
    private Button buttonHitung;
    private TextView textLuas, textKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        // Inisialisasi komponen
        inputSisi = findViewById(R.id.inputSisi);
        buttonHitung = findViewById(R.id.buttonHitung);
        textLuas = findViewById(R.id.textLuas);
        textKeliling = findViewById(R.id.textKeliling);

        // Set OnClickListener pada button
        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungPersegi();
            }
        });
    }

    private void hitungPersegi() {
        // Validasi input sisi
        if (inputSisi.getText().toString().isEmpty()) {
            Toast.makeText(this, "Masukkan panjang sisi", Toast.LENGTH_SHORT).show();
            return;
        }

        // Mengambil nilai sisi
        double sisi = Double.parseDouble(inputSisi.getText().toString());

        // Menghitung luas dan keliling
        double luas = sisi * sisi;
        double keliling = 4 * sisi;

        // Menampilkan hasil
        textLuas.setText("Luas: " + luas);
        textKeliling.setText("Keliling: " + keliling);
    }
}