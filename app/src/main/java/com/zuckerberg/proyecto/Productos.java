package com.zuckerberg.proyecto;

import com.google.gson.annotations.Expose;


public class Productos{

    @Expose
    String nombre;

    @Expose
    int imagen;

    @Expose
    int precio;


    public Productos(String nombre, int imagen, int precio) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}


