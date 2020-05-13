package com.zuckerberg.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class acivityDoctores extends AppCompatActivity {

    ArrayList<String> ListaEsp = new ArrayList<>();

    Spinner lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acivity_doctores);

        lista = findViewById(R.id.listaEspecialistas);

        ListaEsp.add("Médico General");
        ListaEsp.add("Dentista");
        ListaEsp.add("Dermatólogo");
        ListaEsp.add("Endocrinólogo");
        ListaEsp.add("Neurólogo");
        ListaEsp.add("Oftalmólogo");
        ListaEsp.add("Otorrinolaringólogo");
        ListaEsp.add("Pediatra");
        ListaEsp.add("Psiquiatra");
        ListaEsp.add("Terapeuta");
        ListaEsp.add("Traumatólogo");



        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ListaEsp);
        lista.setAdapter(adaptador);
    }
}
