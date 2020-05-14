package com.zuckerberg.proyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class CarritoActivity extends AppCompatActivity {

    RecyclerView rvShoppingCart;
    ProductoSharedPreferencesManager productoSharedPreferencesManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);

        rvShoppingCart = findViewById(R.id.rvShoppingCart);

        productoSharedPreferencesManager = new ProductoSharedPreferencesManager(this);

        ArrayList<Productos> productos = productoSharedPreferencesManager.getProducts();
        final ShoppingCartRecyclerAdapter adapter = new ShoppingCartRecyclerAdapter(this, productos);

        adapter.setOnShoppingCartClickListener(new OnShoppingCartClickListener() {
            @Override
            public void onDeleteItemClick(Productos productos) {
                productoSharedPreferencesManager.delete(productos);
                adapter.updateProducts(productoSharedPreferencesManager.getProducts());
            }
        });

        rvShoppingCart.setAdapter(adapter);
        rvShoppingCart.setLayoutManager(new LinearLayoutManager(this));


    }
}
