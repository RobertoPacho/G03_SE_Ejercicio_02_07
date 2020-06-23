/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.ec.Controlador;

import controladores.ControladorLibreta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class ControladorLibretaTest {
    
    public ControladorLibretaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of crearLibreta method, of class ControladorLibreta.
     */
    @Test
    public void testCrearLibreta() {
        System.out.println("crearLibreta");
        ControladorLibreta instance = new ControladorLibreta();
        instance.crearLibreta();
    }

    /**
     * Test of buscarLibreta method, of class ControladorLibreta.
     */
    @Test
    public void testBuscarLibreta() {
        System.out.println("buscarLibreta");
        String buscarLibreta = "";
        ControladorLibreta instance = new ControladorLibreta();
        String expResult = "";
        String result = instance.buscarLibreta(buscarLibreta);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizar method, of class ControladorLibreta.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        String codigoLibreta = "";
        ControladorLibreta instance = new ControladorLibreta();
        String expResult = "";
        String result = instance.actualizar(codigoLibreta);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminarLibreta method, of class ControladorLibreta.
     */
    @Test
    public void testEliminarLibreta() {
        System.out.println("eliminarLibreta");
        String eliminarLibreta = "";
        ControladorLibreta instance = new ControladorLibreta();
        String expResult = "";
        String result = instance.eliminarLibreta(eliminarLibreta);
        assertEquals(expResult, result);
    }
    
}
