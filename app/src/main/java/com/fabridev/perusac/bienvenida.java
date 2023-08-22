package com.fabridev.perusac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bienvenida extends AppCompatActivity {
    Button btningresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        loadUI();

        btningresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contenido();
            }
        });
    }

    private void loadUI() {
        btningresar = findViewById(R.id.btningresar);
    }

    private void contenido() {
        Intent intent = new Intent(this, contenido.class);
        startActivity(intent);
    }
}