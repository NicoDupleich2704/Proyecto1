package com.zuckerberg.proyecto;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.internal.$Gson$Preconditions;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class ProductoSharedPreferencesManager {

    private Context context;

    public ProductoSharedPreferencesManager(Context context){
            this.context = context;
    }

    public void addToCart(Productos productos){

        ArrayList<Productos> currentProducts = getProducts();
        currentProducts.add(productos);

        writeToSharePreferences(currentProducts);

        Toast.makeText(context, "Producto añadido al carrito", Toast.LENGTH_SHORT).show();
    }

    public ArrayList<Productos> getProducts(){
        SharedPreferences sharedPreferences = context.getSharedPreferences("ShoppingCart", Context.MODE_PRIVATE);
        String productosString = sharedPreferences.getString("productos", "[]");

        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<Productos>>(){}.getType();
        ArrayList<Productos> productos = gson.fromJson(productosString, listType);

        return productos;
    }

    public void delete (Productos productos){
        ArrayList<Productos> productos1 = getProducts();
        int posicion = -1;
        for(int i = 0; i < productos1.size(); i++){
            if(productos.nombre.equals(productos1.get(i).nombre)){
                posicion = i;
                break;
            }
        }
        if(posicion > -1 ){
            productos1.remove(posicion);
        }

        writeToSharePreferences(productos1);
        Toast.makeText(context, "Producto eliminado al carrito", Toast.LENGTH_SHORT).show();
    }

    public void writeToSharePreferences(ArrayList<Productos> productos){
        SharedPreferences sharedPreferences = context.getSharedPreferences("ShoppingCart", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        Gson gson = new Gson();
        String productString = gson.toJson(productos);

        editor.putString("productos", productString);
        editor.apply();
    }

    public int getTotal(){
        int total = 0;
        for(Productos producto : getProducts()){
            total += producto.precio;
        }
        return total;
    }

}

