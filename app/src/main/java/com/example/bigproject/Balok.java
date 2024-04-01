package com.example.bigproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Balok extends AppCompatActivity {

    EditText inputan1, inputan2, inputan3;
    Button calculate;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        inputan1 = findViewById(R.id.inputan);
        inputan2 = findViewById(R.id.inputan2);
        inputan3 = findViewById(R.id.inputan3);
        calculate = findViewById(R.id.calculate);
        hasil = findViewById(R.id.hasil);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strPanjang = inputan1.getText().toString();
                String strLebar = inputan2.getText().toString();
                String strTinggi = inputan3.getText().toString();

                if (strPanjang.isEmpty()) {
                    inputan1.setError("Data Tidak Boleh Kosong");
                    inputan1.requestFocus();
                } else if (strLebar.isEmpty() ) {
                    inputan2.setError("Data Tidak Boleh Kosong");
                    inputan2.requestFocus();
                } else if ( strTinggi.isEmpty()) {
                    inputan3.setError("Data Tidak Boleh Kosong");
                    inputan3.requestFocus();
                } else {
                    Double panjang = Double.parseDouble(strPanjang);
                    Double lebar = Double.parseDouble(strLebar);
                    Double tinggi = Double.parseDouble(strTinggi);

                    Double volume = panjang * lebar * tinggi ;
                    hasil.setText(String.format("%.2f",volume));
                }
            }
        });

    }
}