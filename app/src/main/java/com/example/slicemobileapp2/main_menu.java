package com.example.slicemobileapp2;

import androidx.appcompat.app.AppCompatActivity;
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

public class main_menu extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_main_menu, container, false);

        Button pizzaButton = v.findViewById(R.id.pizzaButton);
        Button pastaButton = v.findViewById(R.id.pastaButton);
        Button calzoneButton = v.findViewById(R.id.calzoneButton);
        Button saladsButton = v.findViewById(R.id.saladsButton);
        Button sidesButton = v.findViewById(R.id.sidesButton);
        Button sweetsButton = v.findViewById(R.id.sweetsButton);
        Button slicesButton = v.findViewById(R.id.slicesButton);

        pizzaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes fragment transaction to pizza page
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = null;
                if (fragmentManager != null)
                    fragmentTransaction = fragmentManager.beginTransaction();
                pizza fragment = new pizza();
                if (fragmentTransaction != null) {
                    fragmentTransaction.replace(R.id.fragment_container, fragment)
                            .addToBackStack("pizza")
                            .commit();
                }
            }
        });

        pastaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes fragment transaction to pasta page
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                pasta fragment = new pasta();
                fragmentTransaction.replace(R.id.fragment_container, fragment)
                        .addToBackStack("pasta")
                        .commit();
            }
        });

        calzoneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes fragment transaction to calzone page
            }
        });

        saladsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes fragment transaction to salads page
            }
        });

        sidesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes fragment transaction to sides page
            }
        });

        sweetsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes fragment transaction to sweets page
            }
        });

        slicesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes fragment transaction to slices page
            }
        });

        return inflater.inflate(R.layout.fragment_main_menu, container, false);
    }


}