package com.zuckerberg.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import java.util.ArrayList;

public class TiposComidaActivity extends AppCompatActivity {

    ImageButton ingresarLacteos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos_comida);

        ingresarLacteos = (ImageButton)findViewById(R.id.botonLacteos);

    }

    public void ingresarLacteos (View view){
        ArrayList<Producto> listProductos = new ArrayList<>();
        listProductos.add(new Producto("Leche", R.drawable.leche, 12));
        listProductos.add(new Producto("Leche Condensada", R.drawable.leche_condensada, 15 ));
        listProductos.add(new Producto("Mantequilla", R.drawable.leche_mantequilla, 14));
        listProductos.add(new Producto("Queso", R.drawable.leche_queso, 20));
        listProductos.add(new Producto("Yogurt", R.drawable.leche_yogurt, 10));

        Intent ingresoLac = new Intent(this, CatalogoProductosActivity.class);
        ingresoLac.putExtra("productos", new Gson().toJson(listProductos));
        startActivity(ingresoLac);
    }

    public void ingresarCarnes (View view){
        ArrayList<Producto> listProductos = new ArrayList<>();
        listProductos.add(new Producto("Bife Chorizo", R.drawable.carnes_bife, 50));
        listProductos.add(new Producto("Chorizo", R.drawable.carnes_chorizo, 25));
        listProductos.add(new Producto("Chuleta", R.drawable.carnes_chuleta, 30));
        listProductos.add(new Producto("Maple de huevos", R.drawable.carnes_huevo, 15));
        listProductos.add(new Producto("Carne Molida", R.drawable.carnes_molida, 33));
        listProductos.add(new Producto("Mortadela", R.drawable.carnes_mortadela, 34));
        listProductos.add(new Producto("Pollo", R.drawable.carnes_pollo, 38));
        listProductos.add(new Producto("Punta de S", R.drawable.carnes_punta, 55));
        listProductos.add(new Producto("Sabalo", R.drawable.carnes_sabalo, 60));
        listProductos.add(new Producto("Trucha", R.drawable.carnes_trucha, 60));

        Intent ingresoCar = new Intent(this, CatalogoProductosActivity.class);
        ingresoCar.putExtra("productos", new Gson().toJson(listProductos));
        startActivity(ingresoCar);
    }
}
