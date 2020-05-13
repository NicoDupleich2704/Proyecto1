package com.zuckerberg.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LecheDerivados extends AppCompatActivity {

    ListView lvProductos;

    ArrayList<Productos1> listProductos1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leche_derivados);

        lvProductos = findViewById(R.id.lvProductosLecheDerivados);

        listProductos1.add(new Productos1("Leche", R.drawable.leche));
        listProductos1.add(new Productos1("Leche Condensada", R.drawable.leche_condensada ));
        listProductos1.add(new Productos1("Mantequilla", R.drawable.leche_mantequilla));
        listProductos1.add(new Productos1("Queso", R.drawable.leche_queso));
        listProductos1.add(new Productos1("Yogurt", R.drawable.leche_yogurt));

        Productos1Adapter adapter = new Productos1Adapter(this, listProductos1);
        lvProductos.setAdapter(adapter);
    }
}
