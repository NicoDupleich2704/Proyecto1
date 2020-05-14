package com.zuckerberg.proyecto;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.internal.$Gson$Preconditions;

public class ProductoSharedPreferencesManager {

    private Context context;

    public ProductoSharedPreferencesManager(Context context){
            this.context = context;
    }

    public void addToCart(Productos productos){
        SharedPreferences sharedPreferences = context.getSharedPreferences("ShoppingCart", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        Gson gson = new Gson();
        String productString = gson.toJson(productos);

        editor.putString("productos", productString);
        editor.apply();

        Toast.makeText(context, "Producto añadido al carrito", Toast.LENGTH_SHORT).show();
    }
}
