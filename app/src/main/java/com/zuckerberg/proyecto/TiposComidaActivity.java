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
    ImageButton ingresarCarnes;
    ImageButton ingresaPatatas;
    ImageButton ingresarVerduras;
    ImageButton ingresarFrutas;
    ImageButton ingresarCereales;
    ImageButton ingresarBebidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos_comida);

        ingresarLacteos = (ImageButton)findViewById(R.id.botonLacteos);
        ingresarCarnes = (ImageButton)findViewById(R.id.botonCarnesPescadoHuevo);
        ingresaPatatas = (ImageButton)findViewById(R.id.botonPatatas);
        ingresarVerduras = (ImageButton)findViewById(R.id.botonVerduras);
        ingresarFrutas = (ImageButton)findViewById(R.id.botonFrutas);
        ingresarCereales = (ImageButton)findViewById(R.id.botonCereales);
        ingresarBebidas = (ImageButton)findViewById(R.id.botonBebidas);

    }

    public void ingresarLacteos (View view){
        ArrayList<Productos> listProductos = new ArrayList<>();
        listProductos.add(new Productos("Leche", R.drawable.leche, 12));
        listProductos.add(new Productos("Leche Condensada", R.drawable.leche_condensada, 15 ));
        listProductos.add(new Productos("Mantequilla", R.drawable.leche_mantequilla, 14));
        listProductos.add(new Productos("Queso", R.drawable.leche_queso, 20));
        listProductos.add(new Productos("Yogurt", R.drawable.leche_yogurt, 10));

        Intent ingresoLac = new Intent(this, CatalogoProductosActivity.class);
        ingresoLac.putExtra("productos", new Gson().toJson(listProductos));
        startActivity(ingresoLac);
    }

    public void ingresarCarnes (View view){
        ArrayList<Productos> listProductos = new ArrayList<>();
        listProductos.add(new Productos("Bife Chorizo", R.drawable.carnes_bife, 50));
        listProductos.add(new Productos("Chorizo", R.drawable.carnes_chorizo, 25));
        listProductos.add(new Productos("Chuleta", R.drawable.carnes_chuleta, 30));
        listProductos.add(new Productos("Maple de huevos", R.drawable.carnes_huevo, 15));
        listProductos.add(new Productos("Carne Molida", R.drawable.carnes_molida, 33));
        listProductos.add(new Productos("Mortadela", R.drawable.carnes_mortadela, 34));
        listProductos.add(new Productos("Pollo", R.drawable.carnes_pollo, 38));
        listProductos.add(new Productos("Punta de S", R.drawable.carnes_punta, 55));
        listProductos.add(new Productos("Sabalo", R.drawable.carnes_sabalo, 60));
        listProductos.add(new Productos("Trucha", R.drawable.carnes_trucha, 60));

        Intent ingresoCar = new Intent(this, CatalogoProductosActivity.class);
        ingresoCar.putExtra("productos", new Gson().toJson(listProductos));
        startActivity(ingresoCar);
    }

    public void ingresarPatatas (View view){
        ArrayList<Productos> listProductos = new ArrayList<>();
        listProductos.add(new Productos("Almendra", R.drawable.patatas_almendra, 20));
        listProductos.add(new Productos("Arvejas", R.drawable.patatas_arvejas, 15 ));
        listProductos.add(new Productos("Camote", R.drawable.patatas_camote, 14));
        listProductos.add(new Productos("Lentejas", R.drawable.patatas_lentejas, 20));
        listProductos.add(new Productos("Papa", R.drawable.patatas_papa, 30));
        listProductos.add(new Productos("Yuca", R.drawable.patatas_yuca, 28));

        Intent ingresoPat = new Intent(this, CatalogoProductosActivity.class);
        ingresoPat.putExtra("productos", new Gson().toJson(listProductos));
        startActivity(ingresoPat);
    }

    public void ingresarVerduras (View view){
        ArrayList<Productos> listProductos = new ArrayList<>();
        listProductos.add(new Productos("Brocoli", R.drawable.verduras_broccoli, 10));
        listProductos.add(new Productos("Cebolla", R.drawable.verduras_cebolla, 15 ));
        listProductos.add(new Productos("Coliflor", R.drawable.verduras_coliflor, 14));
        listProductos.add(new Productos("Lechuga", R.drawable.verduras_lechuga, 20));
        listProductos.add(new Productos("Pepino", R.drawable.verduras_pepino, 30));
        listProductos.add(new Productos("Perejil", R.drawable.verduras_perejil, 28));
        listProductos.add(new Productos("Tomate", R.drawable.verduras_tomate, 22));
        listProductos.add(new Productos("Zanahoria", R.drawable.verduras_zanahoria, 34));

        Intent ingresoVer = new Intent(this, CatalogoProductosActivity.class);
        ingresoVer.putExtra("productos", new Gson().toJson(listProductos));
        startActivity(ingresoVer);
    }

    public void ingresarFrutas (View view){
        ArrayList<Productos> listProductos = new ArrayList<>();
        listProductos.add(new Productos("Frutilla", R.drawable.frutas_frutilla, 10));
        listProductos.add(new Productos("Limon", R.drawable.frutas_limon, 15 ));
        listProductos.add(new Productos("Mango", R.drawable.frutas_mango, 14));
        listProductos.add(new Productos("Manzana", R.drawable.frutas_manzana, 20));
        listProductos.add(new Productos("Naranja", R.drawable.frutas_naranja, 30));
        listProductos.add(new Productos("Pera", R.drawable.frutas_pera, 28));
        listProductos.add(new Productos("Platano", R.drawable.frutas_platano, 22));
        listProductos.add(new Productos("Sandia", R.drawable.frutas_sandia, 34));
        listProductos.add(new Productos("Uva", R.drawable.frutas_uva, 33));

        Intent ingresoFru = new Intent(this, CatalogoProductosActivity.class);
        ingresoFru.putExtra("productos", new Gson().toJson(listProductos));
        startActivity(ingresoFru);
    }

    public void ingresarCereales (View view){
        ArrayList<Productos> listProductos = new ArrayList<>();
        listProductos.add(new Productos("Azucar", R.drawable.cereales_azucar, 10));
        listProductos.add(new Productos("Cebada", R.drawable.cereales_cebada, 15 ));
        listProductos.add(new Productos("Chia", R.drawable.cereales_chia, 14));
        listProductos.add(new Productos("Harina", R.drawable.cereales_harina, 20));
        listProductos.add(new Productos("Maiz", R.drawable.cereales_maiz, 30));
        listProductos.add(new Productos("Sesamo", R.drawable.cereales_sesamo, 28));
        listProductos.add(new Productos("Trigo", R.drawable.cereales_trigo, 22));

        Intent ingresoCer = new Intent(this, CatalogoProductosActivity.class);
        ingresoCer.putExtra("productos", new Gson().toJson(listProductos));
        startActivity(ingresoCer);
    }

    public void ingresarBebidas (View view){
        ArrayList<Productos> listProductos = new ArrayList<>();
        listProductos.add(new Productos("Agua 2L", R.drawable.bebidas_agua, 11));
        listProductos.add(new Productos("Coca Cola 2L", R.drawable.bebidas_cola, 13 ));
        listProductos.add(new Productos("Fanta 2L", R.drawable.bebidas_fanta, 13));
        listProductos.add(new Productos("Gatorade 550ml", R.drawable.bebidas_gatorade, 15));
        listProductos.add(new Productos("Ginger Ale 1L", R.drawable.bebidas_ginger, 9));
        listProductos.add(new Productos("Mocochinchi 2L", R.drawable.bebidas_mocochinchi, 22));
        listProductos.add(new Productos("Sprite 2L", R.drawable.bebidas_sprite, 13));
        listProductos.add(new Productos("Tampico 3L", R.drawable.bebidas_tampico, 22));

        Intent ingresoBeb = new Intent(this, CatalogoProductosActivity.class);
        ingresoBeb.putExtra("productos", new Gson().toJson(listProductos));
        startActivity(ingresoBeb);
    }




}
