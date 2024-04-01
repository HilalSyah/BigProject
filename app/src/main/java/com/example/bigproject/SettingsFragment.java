package com.example.bigproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class SettingsFragment extends Fragment {

    private ImageView kubus;
    private ImageView kerucut;
    private ImageView limas;
    private ImageView balok;
    private ImageView bola;
    private ImageView tabung;

    public SettingsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        kubus = view.findViewById(R.id.kubus);
        kubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rmsKubus = new Intent(getActivity(), Kubus.class);

                startActivity(rmsKubus);
            }
        });

        kerucut = view.findViewById(R.id.kerucut);
        kerucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rmsKerucut = new Intent(getActivity(), Kerucut.class);

                startActivity(rmsKerucut);
            }
        });

        limas = view.findViewById(R.id.limas);
        limas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rmsLimas = new Intent(getActivity(), Limas.class);

                startActivity(rmsLimas);
            }
        });

        balok = view.findViewById(R.id.balok);
        balok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rmsBalok = new Intent(getActivity(), Balok.class);

                startActivity(rmsBalok);
            }
        });

        bola = view.findViewById(R.id.bola);
        bola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rmsBola = new Intent(getActivity(), Bola.class);

                startActivity(rmsBola);
            }
        });

      tabung = view.findViewById(R.id.tabung);
      tabung.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent rmsTabung = new Intent(getActivity(), Tabung.class);

              startActivity(rmsTabung);
          }
      });
        return view;
    }
}