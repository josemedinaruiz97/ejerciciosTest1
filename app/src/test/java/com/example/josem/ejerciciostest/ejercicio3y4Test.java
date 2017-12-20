package com.example.josem.ejerciciostest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by josem on 17/12/2017.
 */
public class ejercicio3y4Test {

    @Test
    public void concatWords() throws Exception {
        String[] palabras = {"1", "2", "3", "4", "5", "6", "7"};
        String resultado = ejercicio3y4.concatWords(palabras);
        assertEquals("1234567", resultado);
    }

    @Test
    public void computeFactorialExpresionIlegal() throws Exception {
        try {
            String resultado = ejercicio3y4.computeFactorial(0);
            fail("la excepcion no se ha lanzado"); //anuncia que no se lanza error
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void computeFactorial() throws Exception {
        try {
            String resultado = ejercicio3y4.computeFactorial(2);
            assertEquals("2", resultado);

        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void equalNull() throws Exception {
        try {
            Boolean resultado = ejercicio3y4.equal(null, null);
            fail("la excepcion no se ha lanzado");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void equalLengthMayor() throws Exception {
        try {
            Boolean resultado = ejercicio3y4.equal(new int[]{1, 2}, new int[]{1});
            assertFalse(resultado);
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void equalNoIgual() throws Exception {
        try {
            Boolean resultado = ejercicio3y4.equal(new int[]{1, 2}, new int[]{2, 1});
            assertFalse(resultado);
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void equal() throws Exception {
        try {
            Boolean resultado = ejercicio3y4.equal(new int[]{1, 2}, new int[]{1, 2});
            assertTrue(resultado);
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void scalarMultiplicationNull() throws Exception {
        try {
            int resultado = ejercicio3y4.scalarMultiplication(null, null);
            fail("la excepcion no se ha lanzado");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void scalarMultiplicationLengthMayor() throws Exception {
        try {
            int resultado = ejercicio3y4.scalarMultiplication(new int[]{1, 2}, new int[]{1});
            fail("la excepcion no se ha lanzado");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void scalarMultiplication() throws Exception {
        try {
            int resultado = ejercicio3y4.scalarMultiplication(new int[]{1, 2}, new int[]{1,2});
            assertEquals(5, resultado);
        } catch (IllegalArgumentException e) {
        }
    }

    @Test(timeout=100)
    public void infinity() {
        while(true);
    }
    //sirve para que el test pare de ejecutarse y de el fallo tras pasar el tiempo;


}