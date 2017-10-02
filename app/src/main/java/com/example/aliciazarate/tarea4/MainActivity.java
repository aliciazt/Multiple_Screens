package com.example.aliciazarate.tarea4;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements  Interfaz_Icon {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        Fragment FragmentIco = new fragment_recycler();

        transaction.replace(R.id.container, FragmentIco);
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        transaction.commit();
    }

    @Override
    public void select_details(int icon, String text) {
        View v = findViewById(R.id.container2);

        if (v == null) {
            Intent intent = new Intent(this,second.class);

            intent.putExtra(DetailsFragment.ICON_KEY, icon);
            intent.putExtra(DetailsFragment.TEXT_KEY, text);

            startActivity(intent);

        } else {

            Bundle bundle = new Bundle ();
            bundle.putInt(DetailsFragment.ICON_KEY, icon);
            bundle.putString(DetailsFragment.TEXT_KEY, text);

            DetailsFragment detailsFragment = DetailsFragment.newInstance(bundle);
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

            transaction.replace(R.id.container2, detailsFragment);
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            transaction.commit();

        }
    }
}
