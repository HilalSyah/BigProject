package com.example.bigproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lingkaran extends AppCompatActivity {

    EditText inputan;
    Button calculate;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);


        inputan = findViewById(R.id.inputan);
        calculate = findViewById(R.id.calculate);
        hasil = findViewById(R.id.hasil);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String nilai = inputan.getText().toString();

               if (nilai.isEmpty()) {
                   inputan.setError("Data Tidak Boleh Kosong");
                   inputan.requestFocus();
               }else {
                   Double jari = Double.parseDouble(nilai);
                   Double luas = 3.14 * (jari * 2);
                   hasil.setText(String.format("%.2f",luas));
               }
            }
        });

    }
}