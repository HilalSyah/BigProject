package com.example.bigproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Persegi extends AppCompatActivity {

    EditText inputan;
    Button calculate;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        inputan = findViewById(R.id.inputan);
        calculate = findViewById(R.id.calculate);
        hasil = findViewById(R.id.hasil);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String angkaStr = inputan.getText().toString();

                if (angkaStr.isEmpty()) {
                    inputan.setError("Data Tidak Boleh Kosong");
                    inputan.requestFocus();
                } else {
                    double angka = Double.parseDouble(angkaStr);

                    double Luas = angka * angka;

                    hasil.setText(String.valueOf(Luas));
                }
            }
        });

    }
}