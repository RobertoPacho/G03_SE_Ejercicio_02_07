/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.ec.Controlador;

import controladores.ControladorDebitoServicio;
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
public class ControladorDebitoServicioTest {
    
    public ControladorDebitoServicioTest() {
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
     * Test of calculardebito method, of class ControladorDebitoServicio.
     */
    @Test
    public void testCalculardebito() {
        System.out.println("calculardebito");
        ControladorDebitoServicio instance = new ControladorDebitoServicio();
        Double expResult = null;
        Double result = instance.calculardebito();
        assertEquals(expResult, result);
    }
    
}
