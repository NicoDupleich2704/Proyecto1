package com.zuckerberg.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class CatalogoProductosActivity extends AppCompatActivity {

    ListView lvProductos1;

    ArrayList<Productos> listProductos1 = new ArrayList<>();

    ProductoSharedPreferencesManager productoSharedPreferencesManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo_productos);


        lvProductos1 = findViewById(R.id.lvProductosLecheDerivados);
        productoSharedPreferencesManager = new ProductoSharedPreferencesManager(this);

        Intent intent = getIntent();
        if (intent.hasExtra("productos")) {
            Gson gson = new Gson();
            Type listType = new TypeToken<ArrayList<Productos>>() {
            }.getType();
            listProductos1 = gson.fromJson(intent.getStringExtra("productos"), listType);
        }

        Productos1Adapter adapter = new Productos1Adapter(this, listProductos1);
        lvProductos1.setAdapter(adapter);

        lvProductos1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
             productoSharedPreferencesManager.addToCart(listProductos1.get(position));
            }
        });
    }
}
