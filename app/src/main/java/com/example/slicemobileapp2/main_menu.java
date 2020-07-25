package com.example.slicemobileapp2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

class main_menu extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_main_menu, container, false);

        Button pizzaButton = (Button) v.findViewById(R.id.pizzaButton);
        Button pastaButton = (Button) v.findViewById(R.id.pastaButton);
        Button calzoneButton = (Button) v.findViewById(R.id.calzoneButton);
        Button saladsButton = (Button) v.findViewById(R.id.saladsButton);
        Button sidesButton = (Button) v.findViewById(R.id.sidesButton);
        Button sweetsButton = (Button) v.findViewById(R.id.sweetsButton);
        Button slicesButton = (Button) v.findViewById(R.id.slicesButton);

        pizzaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes fragment transaction to pizza page
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                pizza fragment = new pizza();
                fragmentTransaction.add(R.id.fragment_container, fragment);
                fragmentTransaction.addToBackStack("pizza");
                fragmentTransaction.commit();
            }
        });

        pastaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes fragment transaction to pizza page
            }
        });

        calzoneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes fragment transaction to pizza page
            }
        });

        saladsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes fragment transaction to pizza page
            }
        });

        sidesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes fragment transaction to pizza page
            }
        });

        sweetsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes fragment transaction to pizza page
            }
        });

        slicesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes fragment transaction to pizza page
            }
        });

        return inflater.inflate(R.layout.fragment_main_menu, container, false);
    }
}