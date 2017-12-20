package com.example.josem.ejerciciostest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by josem on 17/12/2017.
 */
public class UtilidadesNombreTest {
    private UtilidadesNombre utilidadesNombre;
    @Before
    public void setUp() throws Exception {
        utilidadesNombre=new UtilidadesNombre();
    }

    @Test
    public void getNombreDePila() {
        String resultado=utilidadesNombre.getNombreDePila("jose medina ruiz");
        assertEquals("jose",resultado);
    }

    @Test
    public void getApellidosComaNombre() {
        String resultado=utilidadesNombre.getApellidosComaNombre("jose medina ruiz");
        assertEquals("medina ruiz, jose",resultado);
    }

}