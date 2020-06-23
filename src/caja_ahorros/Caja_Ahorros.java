/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja_ahorros;


import ec.ups.edu.clases.Socio;
import ec.ups.edu.ec.Controlador.Controlador_Socio;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Caja_Ahorros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Cliente cliente = new Cliente();
//        cliente.setCedula("0705180016");
//        cliente.setNombre("David");
//        cliente.setApellido("Sarumeno");
//        cliente.setCorreoElectronico("davidsary@outlook.es");
//        cliente.setContrasenia("1234567890");
//        cliente.setTelefono("09906576542");
//        cliente.setDireccion("Pasaje");
//        Date date = new Date();
//        cliente.setFechaNacimiento(date);
//        cliente.crearPersona();
//        System.out.println("Persona \t" + cliente);
        Controlador_Socio controlador_Socio=new Controlador_Socio();
        DateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date fecha = null;
        java.sql.Date fecha2 = null;
        try {
            fecha = ft.parse("2007-04-20");
            fecha2 = new java.sql.Date(fecha.getTime());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una fecha correcta.");
        }

        Socio socio = new Socio();
        socio = new Socio("cacpBiblian", "0123098765");
        //socio.crearPersona();
        controlador_Socio=new Controlador_Socio(socio, 
                "0302295910",
                "Juanito", "Lopez", "jp1993@",
                "patito.1234", "0993440245", "Baños", fecha2);
        //controlador_Socio.crearPersona();
       //controlador_Socio.actualizarPersona();
      controlador_Socio.eliminarPersona("0302295910");
    }

}
