package com.example.pantallas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button boton;
    EditText eTnombre, eTtelefono, eTemail, eTdescripcion;
    DatePicker dpFecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTnombre = (EditText) findViewById(R.id.eTnombre);
        eTtelefono = (EditText) findViewById(R.id.eTtelefono);
        eTemail = (EditText) findViewById(R.id.eTemail);
        eTdescripcion = (EditText) findViewById(R.id.eTdescripcion);
        dpFecha = (DatePicker) findViewById(R.id.dpFecha);
        boton = (Button) findViewById(R.id.boton);

        boton.setOnClickListener(new View.OnClickListener() {

                                     @Override
                                     public void onClick(View v) {

                                         Intent intent = new Intent(MainActivity.this, ConfirmarDatos.class);
                                         intent.putExtra("NOMBRE", eTnombre.getText().toString());
                                         intent.putExtra("DIA", Integer.toString(dpFecha.getDayOfMonth()));
                                         intent.putExtra("MES", Integer.toString((dpFecha.getMonth() + 1)));
                                         intent.putExtra("ANIO", Integer.toString(dpFecha.getYear()));
                                         intent.putExtra("TELEFONO", eTtelefono.getText().toString());
                                         intent.putExtra("EMAIL", eTemail.getText().toString());
                                         intent.putExtra("DESCRIPCION", eTdescripcion.getText().toString());

                                         startActivity(intent);

                                     }
                                 }
        );


    }
}