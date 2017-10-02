package com.example.aliciazarate.tarea4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Alicia Zarate on 1/10/2017.
 */
//infla el contenedor de la segunda actividad
public class second extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);

        Bundle extras = getIntent().getExtras ();

        DetailsFragment detailsFragment = extras != null ? DetailsFragment.newInstance (extras) : DetailsFragment.newInstance (null);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container2,detailsFragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit();

    }
}