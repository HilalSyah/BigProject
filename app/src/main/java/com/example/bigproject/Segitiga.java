package com.example.bigproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {

    EditText inputan1, inputan2;
    Button calculate;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        inputan1 = findViewById(R.id.inputan);
        inputan2 = findViewById(R.id.inputan2);
        calculate = findViewById(R.id.calculate);
        hasil = findViewById(R.id.hasil);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai1 = inputan1.getText().toString();
                String nilai2 = inputan2.getText().toString();

                if (nilai1.isEmpty()) {
                    inputan1.setError("Data Tidak Boleh Kosong");
                    inputan1.requestFocus();
                } else if (nilai2.isEmpty()) {
                    inputan2.setError("Data Tidak Boleh Kosong");
                    inputan2.requestFocus();
                }else {
                    Double alas = Double.parseDouble(nilai1);
                    Double tinggi = Double.parseDouble(nilai2);

                    Double Luas = 0.5 * alas * tinggi;
                    hasil.setText(String.format("%.2f",Luas));
                }
            }
        });

    }
}