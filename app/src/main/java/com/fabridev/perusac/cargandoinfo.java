package com.fabridev.perusac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class cargandoinfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cargandoinfo);

        //tiempo de splash
        TimerTask inicio = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(cargandoinfo.this, bienvenida.class);
                startActivity(intent);
                finish();
            }
        };
        Timer tiempo = new Timer();
        tiempo.schedule(inicio, 5000); //esperamos 5s para pasar al login

    }
}