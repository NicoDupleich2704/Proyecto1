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

        SharedPreferences sharedPreferences = context.getSharedPreferences("ShoppingCart", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        Gson gson = new Gson();
        String productString = gson.toJson(currentProducts);

        editor.putString("productos", productString);
        editor.apply();

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

    public int getTotal(){
        int total = 0;
        for(Productos producto : getProducts()){
            total += producto.precio;
        }
        return total;
    }

}

