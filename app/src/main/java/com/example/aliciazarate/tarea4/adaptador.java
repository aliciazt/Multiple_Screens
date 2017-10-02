package com.example.aliciazarate.tarea4;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Alicia Zarate on 1/10/2017.
 */

///esta clase es la que determina el comportamiento y los recursos a cargar en el recycler
public class adaptador extends RecyclerView.Adapter<adaptador.ViewHolderIconos>{

    ArrayList<clase_iconos> list_icon;
    Interfaz_Icon listener;  ///falta crear la interfaz
    Context context;

    public adaptador(ArrayList<clase_iconos> list_icon, Interfaz_Icon listener){
        this.list_icon=list_icon;
        this.listener= listener;
    }
    @Override
    public adaptador.ViewHolderIconos onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null,false);
        return new ViewHolderIconos(view);
    }

    @Override
    public void onBindViewHolder(final adaptador.ViewHolderIconos holder, final int position) {
        holder.titulo_name.setText(list_icon.get(position).getNombre());
        holder.ima.setImageResource(list_icon.get(position).getMeme());

        holder.itemView.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v ){
                String text= list_icon.get(position).getNombre();
                int icono = list_icon.get(position).getMeme();
                listener.select_details(icono,text); ///metodo que esta definiddo dentro de la interfaz
            }

        });

    }


    @Override
    public int getItemCount() {
       return list_icon.size();
    }

    public class ViewHolderIconos extends RecyclerView.ViewHolder {
        TextView titulo_name;
        ImageView ima;

        public ViewHolderIconos(View itemView) {
            super(itemView);

            ima= (ImageView) itemView.findViewById(R.id.imagen);
            titulo_name= (TextView) itemView.findViewById(R.id.Nombre);
        }
    }
}
