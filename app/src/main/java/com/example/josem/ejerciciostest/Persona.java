package com.example.josem.ejerciciostest;

/**
 * Created by josem on 17/12/2017.
 */

public class Persona {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;

    public Persona(String nombre,String primerApellido,String segundoApellido) {
        this.nombre=nombre;
        this.primerApellido=primerApellido;
        this.segundoApellido=segundoApellido;
    }

    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerNombreyApellidos(){
        return nombre+primerApellido+segundoApellido;
    }
    public String obtenerApellidos(){
        return primerApellido+segundoApellido;
    }

}
