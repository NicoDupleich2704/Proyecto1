package com.zuckerberg.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button ingresarDoctores;
    Button ingresarTecnicos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingresarDoctores = (Button)findViewById(R.id.BotonMedicos);
        ingresarTecnicos = (Button)findViewById(R.id.BotonTecnicos);


    }

    public void ingresarDoc(View view){
        Intent ingresoDoc = new Intent(this, acivityDoctores.class);
        startActivity(ingresoDoc);
    }

    public void ingresoTec(View view){
        Intent ingresoTec = new Intent(this, TecnicosActivity.class);
        startActivity(ingresoTec);
    }
}
