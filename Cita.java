package com.example.practica4;

import java.io.Serializable;

// 3.- crear clase citas
// debera implementar serializable
public class Cita implements Serializable {

    String nombre, apellido;
    int telefono;
    String fecha, hora,category;


    public Cita(String nombre, String apellido, int telefono, String category, String fecha, String hora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.category = category;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }


}
