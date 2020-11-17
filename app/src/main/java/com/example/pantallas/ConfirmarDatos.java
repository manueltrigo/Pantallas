package com.example.pantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {

    TextView sunombre, dia, mes, anio, dato_telefono, dato_email, dato_descripcion;
    Button btnEditar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datos_confirmar);

        recibirDatos();

    }

    private void recibirDatos() {

        sunombre = (TextView) findViewById(R.id.sunombre);
        dia = (TextView) findViewById(R.id.dia);
        mes = (TextView) findViewById(R.id.mes);
        anio = (TextView) findViewById(R.id.anio);
        dato_telefono = (TextView) findViewById(R.id.dato_telefono);
        dato_email = (TextView) findViewById(R.id.dato_email);
        dato_descripcion = (TextView) findViewById(R.id.dato_descripcion);
        btnEditar = (Button) findViewById(R.id.btnEditar);

        Bundle parametros = getIntent().getExtras();
        String name = parametros.getString("NOMBRE");
        String eldia = parametros.getString("DIA");
        String elmes = parametros.getString("MES");
        String elanio = parametros.getString("ANIO");
        String fono = parametros.getString("TELEFONO");
        String correo = parametros.getString("EMAIL");
        String descr = parametros.getString("DESCRIPCION");

        sunombre.setText(parametros.getString("NOMBRE"));
        dia.setText(parametros.getString("DIA"));
        mes.setText(parametros.getString("MES"));
        anio.setText(parametros.getString("ANIO"));
        dato_telefono.setText(parametros.getString("TELEFONO"));
        dato_email.setText(parametros.getString("EMAIL"));
        dato_descripcion.setText(parametros.getString("DESCRIPCION"));

        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


    }

}