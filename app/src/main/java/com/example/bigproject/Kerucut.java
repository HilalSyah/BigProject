package com.example.bigproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kerucut extends AppCompatActivity {

    EditText inputan1, inputan2;
    Button calculate;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerucut);

        inputan1 = findViewById(R.id.inputan);
        inputan2 = findViewById(R.id.inputan2);
        calculate = findViewById(R.id.calculate);
        hasil = findViewById(R.id.hasil);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strJari = inputan1.getText().toString();
                String strTinggi = inputan2.getText().toString();

                if (strJari.isEmpty()) {
                    inputan1.setError("Data Tidak Boleh Kosong");
                    inputan1.requestFocus();
                } else if (strTinggi.isEmpty()) {
                    inputan2.setError("Data Tidak Boleh Kosong");
                    inputan2.requestFocus();
                } else {
                    Double jari = Double.parseDouble(strJari);
                    Double tinggi = Double.parseDouble(strTinggi);

                    Double volume = 3.14 * jari * jari * tinggi / 3 ;
                    hasil.setText(String.format("%.2f", volume));
                }
            }
        });

    }
}