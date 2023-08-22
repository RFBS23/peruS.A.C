package com.fabridev.perusac;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class contenido extends AppCompatActivity {
    private RecyclerView.Adapter adapter;
    private RecyclerView listacategoria, listaproducto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenido);
    }
}