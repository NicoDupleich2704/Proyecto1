package com.zuckerberg.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ProductosAnimales extends AppCompatActivity {

    ImageButton ingresarPerros;
    ImageButton ingresarGatos;
    ImageButton ingresarOtros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_animales);

        ingresarPerros = (ImageButton)findViewById(R.id.BotonPerritos);
        ingresarGatos = (ImageButton)findViewById(R.id.BotonGatitos);
        ingresarOtros = (ImageButton)findViewById(R.id.BotonOtros);

    }

    public void ingresarPerros (View view){
        ArrayList<Productos> listProductos = new ArrayList<>();
        listProductos.add(new Productos("Correas", R.drawable.perro_correas, 70));
        listProductos.add(new Productos("Croquetas Dog Chow", R.drawable.perro_dogchow, 150 ));
        listProductos.add(new Productos("Huesos", R.drawable.perro_huesos, 23));
        listProductos.add(new Productos("Croquetas Pedigree", R.drawable.perro_pedigree, 200));
        listProductos.add(new Productos("Croquetas Royal Canin", R.drawable.perro_royalcanin, 300));

        Intent ingresoPerr = new Intent(this, CatalogoProductosActivity.class);
        ingresoPerr.putExtra("productos", new Gson().toJson(listProductos));
        startActivity(ingresoPerr);
    }

    public void ingresarGatos (View view){
        ArrayList<Productos> listProductos = new ArrayList<>();
        listProductos.add(new Productos("Atun", R.drawable.gato_atun, 12));
        listProductos.add(new Productos("Champion Cat", R.drawable.gato_championcat, 15 ));
        listProductos.add(new Productos("Leche", R.drawable.gato_leche, 14));
        listProductos.add(new Productos("Croquetas One", R.drawable.gato_championcat, 20));
        listProductos.add(new Productos("Croquetas Whiskas", R.drawable.gato_whiskas, 10));

        Intent ingresoGat = new Intent(this, CatalogoProductosActivity.class);
        ingresoGat.putExtra("productos", new Gson().toJson(listProductos));
        startActivity(ingresoGat);
    }

    public void ingresarOtros (View view){
        ArrayList<Productos> listProductos = new ArrayList<>();
        listProductos.add(new Productos("Lechuga para Hamster", R.drawable.verduras_lechuga, 12));
        listProductos.add(new Productos("Caminadora Hamster", R.drawable.otros_caminadorahamster, 150 ));
        listProductos.add(new Productos("Zanahoria para Conejo", R.drawable.verduras_zanahoria, 14));
        listProductos.add(new Productos("Jaulas", R.drawable.otros_jaula, 700));
        listProductos.add(new Productos("Pecera", R.drawable.otros_pecera, 1000));

        Intent ingresoOtr = new Intent(this, CatalogoProductosActivity.class);
        ingresoOtr.putExtra("productos", new Gson().toJson(listProductos));
        startActivity(ingresoOtr);
    }




}
