package com.example.practica4;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CitasAdapter extends ArrayAdapter <Cita> {
    ///creacion variable de tipo contexto
    Context ctx;

    CitasAdapter(Activity contexto, ArrayList<Cita> citas) { // Llamamos al constructor de la clase superior
        super(contexto, R.layout.listviewpersonalizado, citas );
        this.ctx = contexto;
    }

    public View getView(int posicion, View view, ViewGroup parent)
    {
        Cita cita = getItem(posicion);
        if (view==null)
        {
            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.listviewpersonalizado,null);
        }
        TextView titulo = view.findViewById(R.id.idTitulo);
        TextView categoria = view.findViewById(R.id.idCategoria);
        TextView fecha = view.findViewById(R.id.idFecha);
        titulo.setText(cita.getNombre());
        categoria.setText(cita.getCategory());
        fecha.setText(cita.getFecha());
        return view;
    }
}//fin clase citas adapter
