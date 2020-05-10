package com.zuckerberg.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class ProductosAnimalesActivity extends AppCompatActivity {

    private ListView listAn;

    private int Fotos [][][] = [][][];




    ArrayList<String> tiposMascota = new ArrayList<>();

    ListView listViewTiposMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos_animales);

        listViewTiposMascotas = findViewById(R.id.lvTiposMascotas);

        tiposMascota.add("1. Perro");
        tiposMascota.add("2. Gato");
        tiposMascota.add("3. Otro");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tiposMascota);
        listViewTiposMascotas.setAdapter(adapter);

    }
}
