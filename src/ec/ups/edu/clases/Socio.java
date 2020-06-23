/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.clases;

import ec.ups.edu.Conexion.Conection;
import java.util.Date;

/**
 *
 * @author David
 */
public class Socio extends Persona {
    private String nombreEmpresa;
    private String rucEmpresa;
   

    public Socio(String nombreEmpresa, String rucEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.rucEmpresa = rucEmpresa;
    }

    public Socio() {
    }
    

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getRucEmpresa() {
        return rucEmpresa;
    }

    public void setRucEmpresa(String rucEmpresa) {
        this.rucEmpresa = rucEmpresa;
    }

    @Override
    public String toString() {
        return "Socio{" + "nombreEmpresa=" + nombreEmpresa + ", rucEmpresa=" + rucEmpresa + '}';
    }

    @Override
    public int calcularEdad() {
        return 0;

    }

    @Override
    public void crearPersona() {
        
    }

    @Override
    public String buscarPersona(String cedula) {
        return cedula;
    }

    @Override
    public void actualizarPersona() {
        
    }

    @Override
    public void eliminarPersona(String cedula) {
        }
}
