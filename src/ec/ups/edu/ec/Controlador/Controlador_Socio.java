/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.ec.Controlador;

import ec.ups.edu.Conexion.Conection;
import ec.ups.edu.clases.Persona;
import ec.ups.edu.clases.Socio;
import java.util.Date;

/**
 *
 * @author David
 */
public class Controlador_Socio extends Persona {
    private Socio socio;

    public Controlador_Socio(Socio socio, String cedula, String nombre, String apellido, String correoElectronico, String contrasenia, String telefono, String direccion, Date fechaNacimiento) {
        super(cedula, nombre, apellido, correoElectronico, contrasenia, telefono, direccion, fechaNacimiento);
        this.socio = socio;
    }

    public Controlador_Socio() {
    }


    @Override
    public void crearPersona() {
        Conection con =new Conection();
        con.EstableserConexion();
        String insertPro = "INSERT INTO socio(cedula,nombre,apellido,correoElectronico,contrasenia,telefono,direccion,fechaNacimiento,nomEmpresa,rucEmpresa)"
                            //+ "VALUES('0302295910','Roberto','Pacho','robertsonam@','patito.123','0993440245','El Valle','1993-04-30','cacpBiblian','0302295910')";
                        + "VALUES('" + this.cedula + "','"
                        + this.nombre + "','" + this.apellido + "','"
                        + this.correoElectronico + "','" + this.contrasenia + "','"
                        + this.telefono + "','" + this.direccion + "','"
                        + this.fechaNacimiento + "','" + socio.getNombreEmpresa() + "','"
                        + socio.getRucEmpresa() + "')";
                con.InsertDatos(insertPro);
    }

    @Override
    public String buscarPersona(String cedula) {
        return cedula;
    }

    

    @Override
    public int calcularEdad() {
        return 0;
    }

    @Override
    public void actualizarPersona() {
        Conection con =new Conection();
        con.EstableserConexion();
        con.actualizarPro(this.nombre, this.apellido, this.direccion, this.telefono, this.correoElectronico, this.contrasenia, this.cedula);
    }

    @Override
    public void eliminarPersona(String cedula) {
    Conection con =new Conection();
        con.EstableserConexion();
        con.ElimiPro(this.nombre, this.apellido, this.direccion, this.telefono, this.correoElectronico, this.contrasenia, this.cedula);
       
    }

}
