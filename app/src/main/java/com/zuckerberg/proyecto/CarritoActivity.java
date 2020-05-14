package com.zuckerberg.proyecto;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class CarritoActivity extends AppCompatActivity {

    RecyclerView rvShoppingCart;
    ProductoSharedPreferencesManager productoSharedPreferencesManager;

    Button finalizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);

        rvShoppingCart = findViewById(R.id.rvShoppingCart);
        finalizar = findViewById(R.id.finalizar);

        productoSharedPreferencesManager = new ProductoSharedPreferencesManager(this);

        ArrayList<Productos> productos = productoSharedPreferencesManager.getProducts();
        final ShoppingCartRecyclerAdapter adapter = new ShoppingCartRecyclerAdapter(this, productos);

        adapter.setOnShoppingCartClickListener(new OnShoppingCartClickListener() {
            @Override
            public void onDeleteItemClick(Productos productos) {
                productoSharedPreferencesManager.delete(productos);
                adapter.updateProducts(productoSharedPreferencesManager.getProducts());
            }
        });

        rvShoppingCart.setAdapter(adapter);
        rvShoppingCart.setLayoutManager(new LinearLayoutManager(this));

        finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarMensaje();
            }
        });


    }

    private void mostrarMensaje(){
        AlertDialog.Builder mensaje = new AlertDialog.Builder(this);
        mensaje.setTitle("Finalizar");
        mensaje.setMessage("Desea finalizar la compra?");
        mensaje.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();
                Toast.makeText(CarritoActivity.this, "Compra exitosa", Toast.LENGTH_SHORT).show();
            }
        });
        mensaje.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(CarritoActivity.this, "Cancelado", Toast.LENGTH_SHORT).show();
            }
        });
        mensaje.show();
    }
}
