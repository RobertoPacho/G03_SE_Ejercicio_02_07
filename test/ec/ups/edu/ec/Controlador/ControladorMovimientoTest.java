/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.ec.Controlador;

import ec.ups.edu.clases.Transaccion;
import java.util.Date;
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
public class ControladorMovimientoTest {
    
    public ControladorMovimientoTest() {
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
     * Test of crearMovimientoCuenta method, of class ControladorMovimiento.
     */
    @Test
    public void testCrearMovimientoCuenta() {
        System.out.println("crearMovimientoCuenta");
        int codigoDetalle = 0;
        Date fecha = null;
        Transaccion tipoTransaccion = null;
        Double monto = null;
        ControladorMovimiento instance = new ControladorMovimiento();
        instance.crearMovimientoCuenta(codigoDetalle, fecha, tipoTransaccion, monto);
    }

    /**
     * Test of buscarMovimientoCuenta method, of class ControladorMovimiento.
     */
    @Test
    public void testBuscarMovimientoCuenta() {
        System.out.println("buscarMovimientoCuenta");
        String codigoCuenta = "";
        ControladorMovimiento instance = new ControladorMovimiento();
        String expResult = "";
        String result = instance.buscarMovimientoCuenta(codigoCuenta);
        assertEquals(expResult, result);
    }

    /**
     * Test of actualizarMovimientoCuenta method, of class ControladorMovimiento.
     */
    @Test
    public void testActualizarMovimientoCuenta() {
        System.out.println("actualizarMovimientoCuenta");
        String codigoCuenta = "";
        ControladorMovimiento instance = new ControladorMovimiento();
        String expResult = "";
        String result = instance.actualizarMovimientoCuenta(codigoCuenta);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminarMovimientoCuenta method, of class ControladorMovimiento.
     */
    @Test
    public void testEliminarMovimientoCuenta() {
        System.out.println("eliminarMovimientoCuenta");
        String codigoCuenta = "";
        ControladorMovimiento instance = new ControladorMovimiento();
        String expResult = "";
        String result = instance.eliminarMovimientoCuenta(codigoCuenta);
        assertEquals(expResult, result);
    }
    
}
