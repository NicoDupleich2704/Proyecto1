package com.zuckerberg.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class VeterinariosActivity extends AppCompatActivity {

    RadioGroup eleccionAnimal;
    EditText descripcion;
    Button enviar;

    RadioButton perro;
    RadioButton gato;
    RadioButton hamster;
    RadioButton otro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veterinarios);

        eleccionAnimal = findViewById(R.id.election);
        descripcion = findViewById(R.id.descrip);
        enviar = findViewById(R.id.enviarok);

        perro = findViewById(R.id.eperro);
        gato = findViewById(R.id.egato);
        hamster = findViewById(R.id.ehamster);
        otro = findViewById(R.id.eotro);


        eleccionAnimal.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId){
                    case R.id.eperro: {
                        descripcion.setEnabled(false);
                        break;
                    }
                    case R.id.egato: {
                        descripcion.setEnabled(false);
                        break;
                    }
                    case R.id.ehamster: {
                        descripcion.setEnabled(false);
                        break;
                    }
                    case R.id.eotro: {
                        descripcion.setEnabled(true);
                        break;
                    }
                }

            }
        });

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (perro.isChecked()){
                    finish();
                }
                else if (gato.isChecked()){
                    finish();
                }
                else if (hamster.isChecked()){
                    finish();
                }
                else if (otro.isChecked() && !descripcion.getText().toString().isEmpty()){
                    finish();
                }
                else{
                    Toast.makeText(VeterinariosActivity.this, R.string.mensaje_no_enviar, Toast.LENGTH_SHORT).show();
                }
            }
        });






    }
}
