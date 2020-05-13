package com.zuckerberg.proyecto;

import java.io.Serializable;

public class Productos implements Serializable {

    private String nombre;
    private int imagen;
    private int precio;

    Productos(String nombre, int imagen, int precio) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public int getPrecio() {
        return precio;
    }

}


