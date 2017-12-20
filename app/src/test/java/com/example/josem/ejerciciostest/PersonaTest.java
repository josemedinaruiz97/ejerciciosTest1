package com.example.josem.ejerciciostest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by josem on 17/12/2017.
 */
public class PersonaTest {
    private Persona persona;
    @Before
    public void setUp() throws Exception {
        persona=new Persona("jose","medina","ruiz");
    }

    @Test
    public void obtenerNombre() throws Exception {
        String resultado=persona.obtenerNombre();
        assertEquals("jose",resultado);
    }

    @Test
    public void obtenerNombreyApellidos() throws Exception {
        String resultado=persona.obtenerNombreyApellidos();
        assertEquals("josemedinaruiz",resultado);
    }

    @Test
    public void obtenerApellidos() throws Exception {
        String resultado=persona.obtenerApellidos();
        assertEquals("medinaruiz",resultado);
    }

}