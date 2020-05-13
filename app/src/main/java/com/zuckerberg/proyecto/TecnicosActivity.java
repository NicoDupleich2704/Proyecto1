package com.zuckerberg.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TecnicosActivity extends AppCompatActivity {

    Button botonSiguiente;
    EditText problema;
    EditText tipoDeTecnico;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tecnicos);

        botonSiguiente = findViewById(R.id.boton_para_enviar);
        tipoDeTecnico = findViewById(R.id.tecnico_requerido);
        problema = findViewById(R.id.problem);


        botonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (problema.getText().toString().isEmpty() || tipoDeTecnico.getText().toString().isEmpty()){
                    Toast.makeText(TecnicosActivity.this, R.string.mensaje_no_enviar, Toast.LENGTH_SHORT).show();
                }
                else{
                    finish();
                }

            }
        });





    }
}
