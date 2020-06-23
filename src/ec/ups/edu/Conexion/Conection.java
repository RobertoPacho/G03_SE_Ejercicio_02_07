/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */
public class Conection {
    Connection con;
    Statement sentencia;
    ResultSet resultado;

    String driver = "org.mysql.Driver"; // el nombre de nuestro driver Postgres.
    String connectString = "jdbc:mysql://localhost/caja" + "?userTimezone=true&serverTimezone=UTC"; // llamamos nuestra bd
    String user = "grupo3"; // usuario postgres
    String password = "egfa2209"; // no tiene password nuestra bd.

    public boolean EstableserConexion() {
        try {
            con = DriverManager.getConnection(connectString, user, password);
            System.out.println("conectado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        try {
            this.sentencia = (Statement) this.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Advertencia", JOptionPane.WARNING_MESSAGE);
            //JOptionPane.showMessageDialog(null, "Error al crear objeto de declaracion " + ex);
            return false;
        }
        return true;
    }
    
    public void InsertDatos(String sql) {
        
        try {
            sentencia.execute(sql);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Advertencia", JOptionPane.WARNING_MESSAGE);
            Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualizarPro(String nombre, String apellido,String direccion, String telefono, String correo,String contrasenia,String cedula) {
        try {
           // String sqlCont = "UPDATE socio SET nombre='Bryan',apellido='Perez',direccion='Baños',telefono='097568273',correoElectronico='jp@gmail.com',contrasenia='hola' WHERE cedula='0302295910';";
            
            String sqlCont = "UPDATE socio SET nombre='" + nombre + "',apellido='" + apellido + "',direccion='" + direccion + "',telefono='" + telefono + "',correoElectronico='" + correo + "',contrasenia='"+contrasenia+"' WHERE cedula='"+cedula+"'";
            sentencia.execute(sqlCont);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Advertencia", JOptionPane.WARNING_MESSAGE);
            Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void ElimiPro(String nombre, String apellido,String direccion, String telefono, String correo,String contrasenia,String cedula) {
        try {
            String sqlCont = "DELETE  FROM socio WHERE cedula='"+cedula+"'";
            
            //String sqlCont = "UPDATE socio SET nombre='" + nombre + "',apellido='" + apellido + "',direccion='" + direccion + "',telefono='" + telefono + "',correo='" + correo + "',contrasena='"+contrasenia+"' WHERE cedula='0105517296'";
            sentencia.execute(sqlCont);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Advertencia", JOptionPane.WARNING_MESSAGE);
            Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
