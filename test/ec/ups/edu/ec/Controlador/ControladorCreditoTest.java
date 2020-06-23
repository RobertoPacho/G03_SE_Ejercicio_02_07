/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.ec.Controlador;

import ec.ups.edu.clases.Cliente;
import ec.ups.edu.clases.Socio;
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
public class ControladorCreditoTest {
    
    public ControladorCreditoTest() {
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
     * Test of prestamo method, of class ControladorCredito.
     */
    @Test
    public void testPrestamo() {
        System.out.println("prestamo");
        ControladorCredito instance = new ControladorCredito();
        instance.prestamo();
    }

    /**
     * Test of buscarpagos method, of class ControladorCredito.
     */
    @Test
    public void testBuscarpagos() {
        System.out.println("buscarpagos");
        String codigo = "";
        ControladorCredito instance = new ControladorCredito();
        String expResult = "";
        String result = instance.buscarpagos(codigo);
        assertEquals(expResult, result);
    }

    /**
     * Test of buscarCredito method, of class ControladorCredito.
     */
    @Test
    public void testBuscarCredito() {
        System.out.println("buscarCredito");
        Cliente cliente = null;
        ControladorCredito instance = new ControladorCredito();
        Cliente expResult = null;
        Cliente result = instance.buscarCredito(cliente);
        assertEquals(expResult, result);
    }

    /**
     * Test of buscarCreditoS method, of class ControladorCredito.
     */
    @Test
    public void testBuscarCreditoS() {
        System.out.println("buscarCreditoS");
        Socio socio = null;
        ControladorCredito instance = new ControladorCredito();
        Socio expResult = null;
        Socio result = instance.buscarCreditoS(socio);
        assertEquals(expResult, result);
    }
    
}
