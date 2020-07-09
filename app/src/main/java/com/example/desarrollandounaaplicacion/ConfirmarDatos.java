package com.example.desarrollandounaaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {

    private TextView tvNombre_contacto;
    private TextView tvFechaNacimiento;
    private TextView tvTelefono;
    private TextView tvEmail;
    private TextView tvCorfimDescripcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        Bundle parametros = getIntent().getExtras();

        String nombre_contacto = parametros.getString(getResources().getString(R.string.pNombres));
        String fecha_contacto = parametros.getString(getResources().getString(R.string.pFecha));
        String tel_contacto = parametros.getString(getResources().getString(R.string.pTelefono));
        String email_contacto = parametros.getString(getResources().getString(R.string.pEmail));
        String desc_contacto = parametros.getString(getResources().getString(R.string.pDescripcion));

        tvNombre_contacto = (TextView) findViewById(R.id.tvNombre_contacto);
        tvFechaNacimiento = (TextView) findViewById(R.id.tvFechaNacimiento);
        tvTelefono = (TextView) findViewById(R.id.tvTelefono);
        tvEmail = (TextView) findViewById(R.id.tvEmail);
        tvCorfimDescripcion = (TextView) findViewById(R.id.tvCorfimDescripcion);

        tvNombre_contacto.setText(nombre_contacto);
        String fecha_nacimiento = "Fecha de Nacimiento: " + fecha_contacto;
        tvFechaNacimiento.setText(fecha_nacimiento);
        String tel = "Tel: " + tel_contacto;
        tvTelefono.setText(tel);
        String mail = "Email: " + email_contacto;
        tvEmail.setText(mail);
        String desc = "Descripción: " + desc_contacto;
        tvCorfimDescripcion.setText(desc);

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