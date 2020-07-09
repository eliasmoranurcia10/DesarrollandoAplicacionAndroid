package com.example.desarrollandounaaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConfirmarDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);
    }

    //Al presionar el boton EditarDatos

    public void PresionarEditarDatos(View view){
        Intent intent = new Intent(ConfirmarDatos.this, MainActivity.class);

        startActivity(intent);
        finish();
    }

    //Al presionar back
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(ConfirmarDatos.this, MainActivity.class);
        startActivity(intent);
    }
}