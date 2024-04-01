package com.example.bigproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Trapesium extends AppCompatActivity {

  EditText tinggi,sisi1,sisi2;
  Button calculate;
  TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapesium);

        sisi2 = findViewById(R.id.inputan3);
        tinggi = findViewById(R.id.inputan);
        sisi1 = findViewById(R.id.inputan2);
        calculate = findViewById(R.id.calculate);
        hasil = findViewById(R.id.hasil);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strTinggi = tinggi.getText().toString();
                String strSisi1 = sisi1.getText().toString();
                String strSisi2 = sisi2.getText().toString();

                if (strTinggi.isEmpty() ) {
                    tinggi.setError("Data Tidak Boleh Kosong");
                    tinggi.requestFocus();
                } else if ( strSisi1.isEmpty()) {
                    sisi1.setError("Data Tidak Boleh Kosong");
                    sisi1.requestFocus();
                } else if (strSisi2.isEmpty()) {
                    sisi2.setError("Data Tidak Boleh Kosong");
                    sisi2.requestFocus();
                } else {
                    Double tinggi = Double.parseDouble(strTinggi);
                    Double sisi1 = Double.parseDouble(strSisi1);
                    Double sisi2 = Double.parseDouble(strSisi2);

                    Double luas = (sisi1 + sisi2) * tinggi / 2 ;
                    hasil.setText(String.format("%.2f",luas));
                }


            }
        });

    }
}