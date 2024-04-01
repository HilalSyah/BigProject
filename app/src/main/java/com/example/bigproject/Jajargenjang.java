package com.example.bigproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Jajargenjang extends AppCompatActivity {

    EditText inputan1, inputan2;
    Button calculate;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajargenjang);

        inputan1 = findViewById(R.id.inputan);
        inputan2 = findViewById(R.id.inputan2);
        calculate = findViewById(R.id.calculate);
        hasil = findViewById(R.id.hasil);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strAlas = inputan1.getText().toString();
                String strTinggi = inputan2.getText().toString();

                if (strAlas.isEmpty()) {
                    inputan1.setError("Data Tidak Boleh Kosong");
                    inputan1.requestFocus();
                } else if (strTinggi.isEmpty()) {
                    inputan2.setError("Data Tidak Boleh Kosong");
                    inputan2.requestFocus();
                } else  {
                    Double alas = Double.parseDouble(strAlas);
                    Double tinggi = Double.parseDouble(strTinggi);

                    Double luas = alas * tinggi;
                    hasil.setText(String.format("%.2f",luas));
                }

            }
        });
    }
}