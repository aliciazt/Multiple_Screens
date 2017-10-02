package com.example.aliciazarate.tarea4;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * Created by Alicia Zarate on 1/10/2017.
 */

//clase que maneja los recursos con los que se alimenta el recycler
public class fragment_recycler extends Fragment {
    ArrayList<clase_iconos> lista;
    RecyclerView recy;
    Interfaz_Icon liste;


    public void onAttach(Context context){
        super.onAttach(context);

        if(context instanceof Interfaz_Icon){
            liste = (Interfaz_Icon) context;
        }
        else {
            throw new ClassCastException("Error");
        }
    }
    @Nullable
    @Override
    public   View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_recycler,container,false);
                lista= new ArrayList<>();

        recy= (RecyclerView) view.findViewById(R.id.icon_recy);
        recy.setLayoutManager(new GridLayoutManager(getContext(),2));

        llenar_recy();

        adaptador adapter= new adaptador(lista,liste);
        recy.setAdapter(adapter);
        return view;

    }
    ///le dice al recycler que imagenes llamar
    private void llenar_recy(){
        String[] list = getResources().getStringArray(R.array.names);
        String[] img = getResources().getStringArray(R.array.images);

        lista.add(new clase_iconos(R.drawable.cereal_guy,list[0]));
        lista.add(new clase_iconos(R.drawable.f_yeah,list[1]));
        lista.add(new clase_iconos(R.drawable.forever_alone,list[2]));
        lista.add(new clase_iconos(R.drawable.freddie_mercury,list[3]));
        lista.add(new clase_iconos(R.drawable.lol_guy,list[4]));
        lista.add(new clase_iconos(R.drawable.neil_degrasse_tyson,list[5]));
        lista.add(new clase_iconos(R.drawable.oh_crap,list[6]));
        lista.add(new clase_iconos(R.drawable.okay,list[7]));
        lista.add(new clase_iconos(R.drawable.rage_guy,list[8]));
        lista.add(new clase_iconos(R.drawable.troll_face,list[9]));
        lista.add(new clase_iconos(R.drawable.y_u_no_guy,list[10]));
        lista.add(new clase_iconos(R.drawable.yao_ming,list[11]));

    }

}
