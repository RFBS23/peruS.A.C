package com.fabridev.perusac;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class recuperar extends AppCompatActivity {
    Button btnrecuperar;
    Dialog mdialogo;
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

        //abrimos modal
        mdialogo = new Dialog(this);
        btnrecuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mdialogo.setContentView(R.layout.emergente);
                mdialogo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
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

}