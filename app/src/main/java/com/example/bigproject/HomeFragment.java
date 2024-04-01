package com.example.bigproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class HomeFragment extends Fragment {

    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
    private ImageView image5;
    private ImageView image6;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        image1 = view.findViewById(R.id.persegi);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rmsPersegi = new Intent(getActivity(), Persegi.class);

                startActivity(rmsPersegi);
            }
        });

        image2 = view.findViewById(R.id.lingkaran);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rmsLingkaran = new Intent(getActivity(), Lingkaran.class);

                startActivity(rmsLingkaran);
            }
        });

        image3 = view.findViewById(R.id.segitiga);
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rmsSegitiga = new Intent(getActivity(), Segitiga.class);

                startActivity(rmsSegitiga);
            }
        });

        image4 = view.findViewById(R.id.persegipanjang);
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rmsPersegiPanjang = new Intent(getActivity(), PersegiPanjang.class);
                startActivity(rmsPersegiPanjang);
            }
        });

        image5 = view.findViewById(R.id.trapesium);
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rmsTrapesium = new Intent(getActivity(), Trapesium.class);
                startActivity(rmsTrapesium);
            }
        });

        image6 = view.findViewById(R.id.jajargenjang);
        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rmsJajargenjang = new Intent(getActivity(), Jajargenjang.class);
                startActivity(rmsJajargenjang);
            }
        });
        return view;
    }
}