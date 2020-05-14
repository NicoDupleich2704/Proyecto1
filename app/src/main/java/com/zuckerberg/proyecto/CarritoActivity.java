package com.zuckerberg.proyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class CarritoActivity extends AppCompatActivity {

    RecyclerView rvShoppingCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);

        rvShoppingCart = findViewById(R.id.rvShoppingCart);
    }
}
