package com.zuckerberg.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InicioAppActivity extends AppCompatActivity {

    Button ingresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_app);

        ingresar = (Button)findViewById(R.id.BotonIngresarInicio);

    }

    public void Ingresar (View view){
        Intent ingresar = new Intent(this, IniciarSesion.class);
        startActivity(ingresar);
    }

}
