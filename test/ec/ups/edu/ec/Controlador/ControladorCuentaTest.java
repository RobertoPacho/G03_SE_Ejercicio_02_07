/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.ec.Controlador;

import controladores.ControladorCuenta;
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
public class ControladorCuentaTest {
    
    public ControladorCuentaTest() {
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
     * Test of crearCuenta method, of class ControladorCuenta.
     */
    @Test
    public void testCrearCuenta() {
        System.out.println("crearCuenta");
        ControladorCuenta instance = new ControladorCuenta();
        instance.crearCuenta();
    }

    /**
     * Test of buscarCuenta method, of class ControladorCuenta.
     */
    @Test
    public void testBuscarCuenta() {
        System.out.println("buscarCuenta");
        String numeroCuenta = "";
        ControladorCuenta instance = new ControladorCuenta();
        String expResult = "";
        String result = instance.buscarCuenta(numeroCuenta);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizar method, of class ControladorCuenta.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        String numeroCuenta = "";
        ControladorCuenta instance = new ControladorCuenta();
        String expResult = "";
        String result = instance.actualizar(numeroCuenta);
        assertEquals(expResult, result);
    }
    
}
