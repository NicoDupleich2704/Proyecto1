package com.zuckerberg.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class IniciarSesion extends AppCompatActivity {

    Button inresarCompras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);

        inresarCompras = (Button)findViewById(R.id.BotonIngresar);

    }

    public void IngresarComprar (View view){
        Intent comprar = new Intent(this, MainActivity.class);
        startActivity(comprar);
    }
}
