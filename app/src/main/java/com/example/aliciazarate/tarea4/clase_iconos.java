package com.example.aliciazarate.tarea4;

/**
 * Created by Alicia Zarate on 1/10/2017.
 */

public class clase_iconos {
    private int meme;
    private  String nombre;

    ///contructor
    public clase_iconos(int meme, String nombre) {
        this.meme = meme;
        this.nombre = nombre;
    }

    public int getMeme() {
        return meme;
    }


    public String getNombre() {
        return nombre;
    }

    //metodo setter
    public void setMeme(int image, String titu, String des){
        this.meme=image;
        this.nombre=titu;
    }
}
