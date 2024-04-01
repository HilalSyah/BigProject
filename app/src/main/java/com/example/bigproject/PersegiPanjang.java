package com.example.bigproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiPanjang extends AppCompatActivity {


    EditText inputan1, inputan2;
    Button calculate;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

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
                    Integer panjang = Integer.parseInt(nilai1);
                    Integer lebar = Integer.parseInt(nilai2);

                    Integer Luas = panjang * lebar;
                    hasil.setText(String.valueOf(Luas));
                }
            }
        });

    }
}