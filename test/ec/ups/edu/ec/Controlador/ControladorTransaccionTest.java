/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.ec.Controlador;

import controladores.ControladorTransaccion;
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
public class ControladorTransaccionTest {
    
    public ControladorTransaccionTest() {
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
     * Test of calcularSaldo method, of class ControladorTransaccion.
     */
    @Test
    public void testCalcularSaldo() {
        System.out.println("calcularSaldo");
        ControladorTransaccion instance = new ControladorTransaccion();
        Double expResult = null;
        Double result = instance.calcularSaldo();
        assertEquals(expResult, result);
    }
    
}
