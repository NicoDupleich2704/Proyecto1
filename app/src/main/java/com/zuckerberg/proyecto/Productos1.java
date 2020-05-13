package com.zuckerberg.proyecto;

import java.io.Serializable;

public class Productos1 implements Serializable {

    private String nombre;
    private int imagen;

    Productos1(String nombre, int imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public int getImagen() {
        return imagen;
    }
}
