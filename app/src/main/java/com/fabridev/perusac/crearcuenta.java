package com.fabridev.perusac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class crearcuenta extends AppCompatActivity {
    ImageView btnflecha;
    Button btnregistrase;
    EditText contraseña;
    ImageView contraseñaicono;
    private boolean vercontraseña = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crearcuenta);

        //referencia
        loadUI();

        //eventos
        btnflecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActivity(login.class);
            }
        });
        btnregistrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActivity(cargandoinfo.class);
            }
        });
    }

    private void loadUI() {
        btnflecha = findViewById(R.id.btnflecha);
        btnregistrase = findViewById(R.id.btnregistrase);
    }

    private void abrirActivity(Class nameActivity) {
        Intent intent = new Intent(getApplicationContext(), nameActivity);
        startActivity(intent);
    }

    private void mostrarcontraseña(View v) {
        //ocultamos y mostramos la contraseña
        if (vercontraseña){
            vercontraseña = false;
            contraseña.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
            contraseñaicono.setImageResource(R.raw.eye_show);
        } else {
            vercontraseña = true;
            contraseña.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
            contraseñaicono.setImageResource(R.raw.eye_hide);
        }
        contraseña.setSelection(contraseña.length());
    }

}