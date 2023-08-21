package com.fabridev.perusac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class login extends AppCompatActivity {
    EditText correo, contraseña;
    ImageView contraseñaicono;
    TextView crearcuenta, recuperarcontraseña, btniniciarsesion;
    private boolean vercontraseña = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //controlar el boton si editext esta vacio


        //referencias
        loadUI();

        //mostramos la contraseña
        contraseñaicono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarcontraseña(v);
            }
        });

        //eventos
        crearcuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActivity(crearcuenta.class);
            }
        });
        recuperarcontraseña.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActivity(recuperar.class);
            }
        });
        btniniciarsesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActivity(contenido.class);
            }
        });
    }

    private void loadUI(){
        correo = findViewById(R.id.correo);
        contraseña = findViewById(R.id.contraseña);
        contraseñaicono = findViewById(R.id.contraseñaicono);
        crearcuenta = findViewById(R.id.crearcuenta);
        recuperarcontraseña = findViewById(R.id.recuperarcontraseña);
        btniniciarsesion = findViewById(R.id.btniniciarsesion);
    }

    //metodo para aperturar cualquier ACTVITY
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