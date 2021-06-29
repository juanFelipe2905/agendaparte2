package com.example.practica4.SQlite_OpenHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQlite_OpenHelper extends SQLiteOpenHelper {

    //variables                                                 nombre tabla    campos y tipos de dato para cada uno
    public static final String CREAR_TABLA_CITAS= "CREATE TABLE citas(id INTEGER PRIMARY KEY, nombre TEXT, apellido TEXT, telefono INTEGER, fecha TEXT, hora TEXT, category TEXT)";
    public static final String DB_NAME ="BD_CITAS";
    public static final int DB_version=1;

    //CONSTRUCTOR
    public SQlite_OpenHelper(Context context) {
        super(context, DB_NAME, null, DB_version);
    }

    @Override
    public void onCreate(SQLiteDatabase baseDeDatos) {
        baseDeDatos.execSQL(CREAR_TABLA_CITAS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase baseDeDatos, int i, int i1) {

    }
}
