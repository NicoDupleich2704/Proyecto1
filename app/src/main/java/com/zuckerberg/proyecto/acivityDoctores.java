package com.zuckerberg.proyecto;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class acivityDoctores extends AppCompatActivity {

    ArrayList<String> ListaEsp = new ArrayList<>();

    Spinner lista;
    Button envio;
    EditText siintomas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acivity_doctores);

        lista = findViewById(R.id.listaEspecialistas);
        envio = findViewById(R.id.botoncito_envio);
        siintomas = findViewById(R.id.sintomas);

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

        envio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (siintomas.getText().toString().isEmpty()){
                    Toast.makeText(acivityDoctores.this, R.string.mensaje_no_enviar, Toast.LENGTH_SHORT).show();
                }
                else{
                    mostrarMensaje();

                }
            }
        });


    }

    private void mostrarMensaje(){
        AlertDialog.Builder mensaje = new AlertDialog.Builder(this);
        mensaje.setTitle("Enviar");
        mensaje.setMessage("El doctor se contactara con usted mediante videollamada");
        mensaje.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                Toast.makeText(acivityDoctores.this, "Enviado", Toast.LENGTH_SHORT).show();
            }
        });
        mensaje.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                Toast.makeText(acivityDoctores.this, "Cancelado", Toast.LENGTH_SHORT).show();
            }
        });
        mensaje.show();
    }
}
