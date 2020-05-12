package com.zuckerberg.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

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
        Intent ingresoLac = new Intent(this, LecheDerivados.class);
        startActivity(ingresoLac);
    }
}
