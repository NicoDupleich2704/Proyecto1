package com.zuckerberg.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LecheDerivados extends AppCompatActivity {

    ArrayList<String> productosLecheDerivados = new ArrayList<>();

    ListView lvProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leche_derivados);

        lvProductos = findViewById(R.id.lvProductosLecheDerivados);

        productosLecheDerivados.add("Leche");
        productosLecheDerivados.add("Leche Condensada");
        productosLecheDerivados.add("Mantequilla");
        productosLecheDerivados.add("Queso");
        productosLecheDerivados.add("Yogurt");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, productosLecheDerivados);

        lvProductos.setAdapter(adapter);

    }
}
