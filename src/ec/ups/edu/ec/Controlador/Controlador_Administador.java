/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.ec.Controlador;

import ec.ups.edu.clases.Persona;

/**
 *
 * @author David
 */
public class Controlador_Administador extends Persona {

    @Override
    public void crearPersona() {

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarPersona(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
