package com.example.slicemobileapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            main_menu fragment1 = new main_menu();
            getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment1)
                    .commit();
        }

    }
}