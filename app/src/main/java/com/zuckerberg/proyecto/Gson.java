package com.zuckerberg.proyecto;

import java.lang.reflect.Type;
import java.util.ArrayList;

class Gson {

    @Expose
    private String nombre;

    @Expose
    private int imagen;

    @Expose
    private int precio;

    Gson() {
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

    public boolean toJson(ArrayList<Productos> listProductos) {
        return false;
    }

    public ArrayList<Productos> fromJson(String productos, Type listType) {
        return null;
    }
}
