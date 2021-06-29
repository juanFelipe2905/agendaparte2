package com.example.practica4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class ListDatesActivity extends AppCompatActivity
{
    ArrayList<Cita> arrayLista = new ArrayList<Cita>();
    ListView opciones;
    Button btnRegresar;

    //private TextView txtViewName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_dates);
//5 en ListDateActivity agregar el siguiente codigo en el oncreate:
        Cita c = (Cita)getIntent().getSerializableExtra("cita");
        //txtViewName.setText("Nombre " + c);
        Toast.makeText(this,c.getCategory(),Toast.LENGTH_LONG).show();

        opciones = findViewById(R.id.viewPersonalizada);


        //arrayLista.add(c);
        //CitasAdapter adapter = new CitasAdapter(this,arrayLista);
        //opciones.setAdapter(adapter);
        CitasSingleton.singleton.agregarCita(c);
        CitasAdapter adapter = new CitasAdapter(this,CitasSingleton.singleton.getCita());
        opciones.setAdapter(adapter);
    }

    //metodo de regreso
    public void Regresar(View v){

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}