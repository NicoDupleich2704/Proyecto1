package com.zuckerberg.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageButton ingresarDoctores;
    ImageButton ingresarTecnicos;
    ImageButton ingresarTiposComida;
    ImageButton ingresarTiposMascotas;
    ImageButton ingresarMedicinas;
    ImageButton ingresarCarrito;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingresarDoctores = (ImageButton)findViewById(R.id.BotonMedicos);
        ingresarTecnicos = (ImageButton)findViewById(R.id.BotonTecnicos);
        ingresarTiposComida = (ImageButton)findViewById(R.id.BotonComida);
        ingresarTiposMascotas = (ImageButton)findViewById(R.id.BotonMascotas);
        ingresarMedicinas = (ImageButton)findViewById(R.id.BotonMedicina);
        ingresarCarrito = findViewById(R.id.BotonCarrito);


    }

    public void ingresarDoc(View view){
        Intent ingresoDoc = new Intent(this, acivityDoctores.class);
        startActivity(ingresoDoc);
    }

    public void ingresoTec(View view){
        Intent ingresoTec = new Intent(this, TecnicosActivity.class);
        startActivity(ingresoTec);
    }

    public void ingresoTipoComida(View view){
        Intent ingresoTC = new Intent(this, TiposComidaActivity.class);
        startActivity(ingresoTC);
    }

    public void ingresoTiposMascotas (View view){
        Intent ingresoTM = new Intent(this, ProductosAnimales.class);
        startActivity(ingresoTM);
    }

    public void ingresoVet (View view){
        Intent ingresoVET = new Intent(this, VeterinariosActivity.class);
        startActivity(ingresoVET);
    }

    public void ingresarMedicinas (View view){
        ArrayList<Productos> listProductos = new ArrayList<>();
        listProductos.add(new Productos("Algodon", R.drawable.medi_algodon, 30));
        listProductos.add(new Productos("Aspirina", R.drawable.medi_aspirina, 45 ));
        listProductos.add(new Productos("Gel", R.drawable.medi_gel, 140));
        listProductos.add(new Productos("Ibuprofeno", R.drawable.medi_ibuprofeno, 200));
        listProductos.add(new Productos("Iodo", R.drawable.medi_iodo, 100));
        listProductos.add(new Productos("Paracetamol", R.drawable.medi_paracetamol, 140));
        listProductos.add(new Productos("Tiritas", R.drawable.medi_tirita, 40));

        Intent ingresoMed = new Intent(this, CatalogoProductosActivity.class);
        ingresoMed.putExtra("productos", new Gson().toJson(listProductos));
        startActivity(ingresoMed);
    }

    public void ingresarLimpieza (View view){
        ArrayList<Productos> listProductos = new ArrayList<>();
        listProductos.add(new Productos("Ace", R.drawable.limp_ace, 45));
        listProductos.add(new Productos("Alcohol en gel", R.drawable.limp_alcoholengel, 120 ));
        listProductos.add(new Productos("Cloro", R.drawable.limp_cloro, 40));
        listProductos.add(new Productos("Detergente", R.drawable.limp_detergente, 20));
        listProductos.add(new Productos("Jabon", R.drawable.limp_jabon, 10));
        listProductos.add(new Productos("Pepel higienico", R.drawable.limp_papel, 42));
        listProductos.add(new Productos("Shampoo", R.drawable.limp_shampoo, 30));

        Intent ingresoLim = new Intent(this, CatalogoProductosActivity.class);
        ingresoLim.putExtra("productos", new Gson().toJson(listProductos));
        startActivity(ingresoLim);
    }

    public void ingresarCarrito(View view){
        Intent ingresoCarr = new Intent(this, CarritoActivity.class);
        startActivity(ingresoCarr);
    }
}
