package com.example.bigproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Limas extends AppCompatActivity {

    EditText inputan1, inputan2, inputan3;
    Button calculate;
    TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limas);

        inputan1 = findViewById(R.id.inputan);
        inputan2 = findViewById(R.id.inputan2);
        inputan3 = findViewById(R.id.inputan3);
        calculate = findViewById(R.id.calculate);
        hasil = findViewById(R.id.hasil);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strAlas = inputan1.getText().toString();
                String strTinggiAlas = inputan2.getText().toString();
                String strTinggiLimas = inputan3.getText().toString();

                if (strAlas.isEmpty()) {
                    inputan1.setError("Data Tidak Boleh Kosong");
                    inputan1.requestFocus();
                } else if ( strTinggiAlas.isEmpty()) {
                    inputan2.setError("Data Tidak Boleh Kosong");
                    inputan2.requestFocus();
                } else if ( strTinggiLimas.isEmpty()) {
                    inputan3.setError("Data Tidak Boleh Kosong");
                    inputan3.requestFocus();
                } else {
                    Double panjang = Double.parseDouble(strAlas);
                    Double lebar = Double.parseDouble(strTinggiAlas);
                    Double tinggi = Double.parseDouble(strTinggiLimas);

                    Double volume = panjang * lebar * tinggi / 6 ;
                    hasil.setText(String.format("%.2f",volume));
                }
            }
        });


    }
}