package com.example.josem.ejerciciostest;

/**
 * Created by josem on 17/12/2017.
 */

public class UtilidadesNombre {
    public String getNombreDePila(String nombreCompleto){
        String[]arrayNombre=nombreCompleto.split(" ");
        return arrayNombre[0];
    }
    public String getApellidosComaNombre(String nombreCompleto){
        String apellidosyNombre="";
        String[]arrayNombre=nombreCompleto.split(" ");
        apellidosyNombre=arrayNombre[1]+" "+arrayNombre[2]+", "+arrayNombre[0];
        return apellidosyNombre;
    }
}
