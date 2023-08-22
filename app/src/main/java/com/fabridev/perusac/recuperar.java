package com.fabridev.perusac;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class recuperar extends AppCompatActivity {
    Button btnrecuperar;
    TextView crearcuenta, regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar);

        //referencias
        loadUI();

        //eventos
        crearcuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActivity(crearcuenta.class);
            }
        });
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActivity(login.class);
            }
        });

        btnrecuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                veralerta();
            }
        });
    }

    private void loadUI() {
        btnrecuperar = findViewById(R.id.btnrecuperar);
        crearcuenta = findViewById(R.id.crearcuenta);
        regresar = findViewById(R.id.regresar);
    }

    //metodo para aperturar cualquier ACTVITY
    private void abrirActivity(Class nameActivity) {
        Intent intent = new Intent(getApplicationContext(), nameActivity);
        startActivity(intent);
    }

    private void veralerta(){
        ConstraintLayout alerta = findViewById(R.id.alerta);
        View view = LayoutInflater.from(recuperar.this).inflate(R.layout.emergente, alerta);
        ImageButton cerrarmodal = view.findViewById(R.id.cerrarmodal);

        AlertDialog.Builder builder = new AlertDialog.Builder(recuperar.this);
        builder.setView(view);
        final AlertDialog alertDialog = builder.create();

        cerrarmodal.findViewById(R.id.cerrarmodal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
                Toast.makeText(recuperar.this, "regrese al login y coloque su nueva contraseña", Toast.LENGTH_LONG).show();
            }
        });
        if(alertDialog.getWindow() != null) {
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialog.show();
    }
}