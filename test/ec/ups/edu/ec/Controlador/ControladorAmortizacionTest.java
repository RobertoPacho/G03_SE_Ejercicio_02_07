/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.ec.Controlador;

import ec.ups.edu.clases.Cliente;
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
public class ControladorAmortizacionTest {
    
    public ControladorAmortizacionTest() {
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
     * Test of calculo_interes method, of class ControladorAmortizacion.
     */
    @Test
    public void testCalculo_interes() {
        System.out.println("calculo_interes");
        ControladorAmortizacion instance = new ControladorAmortizacion();
        double expResult = 0.0;
        double result = instance.calculo_interes();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calculo_capital method, of class ControladorAmortizacion.
     */
    @Test
    public void testCalculo_capital() {
        System.out.println("calculo_capital");
        ControladorAmortizacion instance = new ControladorAmortizacion();
        double expResult = 0.0;
        double result = instance.calculo_capital();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calculo_meses method, of class ControladorAmortizacion.
     */
    @Test
    public void testCalculo_meses() {
        System.out.println("calculo_meses");
        ControladorAmortizacion instance = new ControladorAmortizacion();
        double expResult = 0.0;
        double result = instance.calculo_meses();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of crearnuevo method, of class ControladorAmortizacion.
     */
    @Test
    public void testCrearnuevo() {
        System.out.println("crearnuevo");
        int codigo = 0;
        double cantidad = 0.0;
        int meses = 0;
        double intereses = 0.0;
        Cliente idCliente = null;
        ControladorAmortizacion instance = new ControladorAmortizacion();
        instance.crearnuevo(codigo, cantidad, meses, intereses, idCliente);
    }
    
}
