package com.zuckerberg.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TiposComidaActivity extends AppCompatActivity {


    ArrayList<String> tiposComida = new ArrayList<>();

    ListView listViewTiposComida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos_comida);

        listViewTiposComida = findViewById(R.id.lvTiposComida);

        tiposComida.add("1. Leche y derivados");
        tiposComida.add("2. Carnes, pescado y huevo");
        tiposComida.add("3. Patatas, legumbres y frutos secos");
        tiposComida.add("4. Verduras y hortalizas");
        tiposComida.add("5. Frutas");
        tiposComida.add("6. Cereales y derivados");
        tiposComida.add("7. Bebidas");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tiposComida);
        listViewTiposComida.setAdapter(adapter);

    }
}
