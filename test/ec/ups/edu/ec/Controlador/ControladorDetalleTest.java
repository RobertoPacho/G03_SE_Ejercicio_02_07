/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.ec.Controlador;

import ec.ups.edu.clases.ControladorDetalle;
import ec.ups.edu.clases.Movimiento;
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
public class ControladorDetalleTest {
    
    public ControladorDetalleTest() {
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
     * Test of calcularSaldo method, of class ControladorDetalle.
     */
    @Test
    public void testCalcularSaldo() {
        System.out.println("calcularSaldo");
        Double saldo = null;
        ControladorDetalle instance = new ControladorDetalle();
        Double expResult = null;
        Double result = instance.calcularSaldo(saldo);
        assertEquals(expResult, result);
    }

    /**
     * Test of agregarMovimiento method, of class ControladorDetalle.
     */
    @Test
    public void testAgregarMovimiento() {
        System.out.println("agregarMovimiento");
        Movimiento m = null;
        ControladorDetalle instance = new ControladorDetalle();
        instance.agregarMovimiento(m);
    }
    
}
