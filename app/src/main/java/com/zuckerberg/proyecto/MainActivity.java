package com.zuckerberg.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {

    ImageButton ingresarDoctores;
    ImageButton ingresarTecnicos;
    ImageButton ingresarTiposComida;
    ImageButton ingresarTiposMascotas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingresarDoctores = (ImageButton)findViewById(R.id.BotonMedicos);
        ingresarTecnicos = (ImageButton)findViewById(R.id.BotonTecnicos);
        ingresarTiposComida = (ImageButton)findViewById(R.id.BotonComida);
        ingresarTiposMascotas = (ImageButton)findViewById(R.id.BotonMascotas);


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
        Intent ingresoVET = new Intent(this, AnimalesActivity.class);
        startActivity(ingresoVET);
    }
}
