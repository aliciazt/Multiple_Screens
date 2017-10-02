package com.example.aliciazarate.tarea4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Alicia Zarate on 1/10/2017.
 */
public class DetailsFragment extends Fragment {

    public static String ICON_KEY = "icon";
    public static String TEXT_KEY = "text";

    public static DetailsFragment newInstance(@Nullable Bundle extras) {
        DetailsFragment fragment = new DetailsFragment();

        if (extras != null) {
            fragment.setArguments(extras);
        }

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.details, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        TextView textView = (TextView) getActivity().findViewById(R.id.titulo);
        ImageView imageView = (ImageView) getActivity().findViewById(R.id.imagenview);
        TextView textView2 = (TextView) getActivity().findViewById(R.id.descripcion);

        Bundle extras = getArguments();

        if (extras != null) {
            int icon = (int) extras.get(DetailsFragment.ICON_KEY);
            String text = (String) extras.get(DetailsFragment.TEXT_KEY);

            String[] res = getResources().getStringArray(R.array.descriptions);
            String[] img = getResources().getStringArray(R.array.images);

            textView.setText(text); //titulo
            imageView.setImageResource(icon); //imagen

           // textView2.setText(String.valueOf(icon)); se muestra la ruta con valor entero de la imagen

            if (icon == 2130837587) {
                textView2.setText(res[0]);
            }

            if (icon == 2130837588) {
                textView2.setText(res[1]);
            }

            if (icon == 2130837589) {
                textView2.setText(res[2]);
            }

            if (icon == 2130837590) {
                textView2.setText(res[3]);
            }

            if (icon == 2130837591) {
                textView2.setText(res[4]);
            }

            if (icon == 2130837592) {
                textView2.setText(res[5]);
            }

            if (icon == 2130837603) {
                textView2.setText(res[6]);
            }

            if (icon == 2130837604) {
                textView2.setText(res[7]);
            }

            if (icon == 2130837605) {
                textView2.setText(res[8]);
            }

            if (icon == 2130837606) {
                textView2.setText(res[9]);
            }

            if (icon == 2130837607) {
                textView2.setText(res[10]);
            }

            if (icon == 2130837608) {
                textView2.setText(res[11]);

            }
        }
    }
}

